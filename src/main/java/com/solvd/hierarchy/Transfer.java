package com.solvd.hierarchy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;

import static java.time.LocalDateTime.now;

public class Transfer {
    Calendar c = Calendar.getInstance();
    private static Logger LOGGER = LogManager.getLogger(Main.class);
    private LocalDateTime dueDate;
    private double amount;
    private int opt;
    Map<String, Double> historicalTransfer = new HashMap<>();
    BankAccount bank = new BankAccount();

    public Transfer() {

        setHistoryTransfer();
    }

    public void setHistoryTransfer() {
        historicalTransfer.put("January", 1000.0);
        historicalTransfer.put("February", 1500.0);
        historicalTransfer.put("March", 1200.0);
        historicalTransfer.put("April", 3000.0);
        historicalTransfer.put("May", 1500.0);
        historicalTransfer.put("June", 500.0);
    }

    public Map getHistoryTransfer() {
        return historicalTransfer;
    }

    public Map setLastTransfer(double amount) {
        this.dueDate = now();
        this.amount = amount;
        historicalTransfer.put(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH), this.amount);

        return historicalTransfer;
    }

    public void getTransferList() {
        LOGGER.info(Collections.singletonList(this.historicalTransfer));
    }

    public void transferMenu() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Select the operation: ");
        LOGGER.info("1- Make a transfer: ");
        LOGGER.info("2- Go back");
        this.opt = scanner.nextInt();
        switch (this.opt) {
            case 1:
                LOGGER.info("Insert the amount");
                this.amount = scanner.nextDouble();
                setLastTransfer(this.amount);
                //later I will have to access the same key and update or make an addition
                getTransferList();
                break;
            case 2:
                bank.menu();
                break;
        }
    }


}
