package com.solvd.hierarchy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Deposit extends BankAccount {
    private double amountMoney;
    protected static Logger LOGGER = LogManager.getLogger(Main.class);

    public Deposit() {

    }

    public void setDeposit(double amountMoney) {
        this.amountMoney = this.amountMoney + amountMoney;
    }

    public double getDeposit() {
        return amountMoney;
    }

    public void depositMenu() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("\n Select the option");
        LOGGER.info("1- Make a depo.");
        LOGGER.info("1- Check your deposits.");
        int opt = scanner.nextInt();
        if (opt == 1) {
            LOGGER.info("Please, insert the amount of money.");
            double ammount = scanner.nextDouble();
            setDeposit(ammount);
            LOGGER.info("\n Yor new ammount its: " + getDeposit());
        } else {
            LOGGER.info("\n Yor amount of money ammount is: " + getDeposit());
        }
    }

}
