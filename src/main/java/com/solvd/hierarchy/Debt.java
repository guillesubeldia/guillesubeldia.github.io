package com.solvd.hierarchy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Debt extends BankAccount {
    private Queue<Double> debtQueue = new LinkedList<Double>();
    private int selectedOption;

    public Debt() {
        setAllDebt();
    }

    public void debtMenu() {
        LOGGER.info("How many of your debts want to pay");
        this.selectedOption = scanner.nextInt();
        removeDebt(selectedOption);
        LOGGER.info("-----------------------------");
        getAllDebt();
    }

    public void getAllDebt() {
        Iterator<Double> elements = debtQueue.iterator();
        while (elements.hasNext()) {
            LOGGER.info("Debts list: " + elements.next());
        }
    }

    public void setAllDebt() {
        this.debtQueue.add(1500.0);
        this.debtQueue.add(2000.0);
        this.debtQueue.add(4500.0);
        this.debtQueue.add(3000.0);
    }

    public Queue removeDebt(double quantity) {

        for (int i = 1; i <= quantity; i++) {
            this.debtQueue.remove();
        }
        return this.debtQueue;
    }

}
