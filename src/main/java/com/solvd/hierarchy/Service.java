package com.solvd.hierarchy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Service {
    private static Logger LOGGER = LogManager.getLogger(Main.class);
    private double amountOfMoney;
    private String firstName;
    private String lastName;
    private int typeClient;
    private int optionSelected;

    private double deposit;


    public void Service(String firstName, String lastName, int typeClient, int optionSelected) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeClient = typeClient;
        this.optionSelected = optionSelected;

        BankAccount bank = new BankAccount();

        Credit credit = new Credit();

        credit.Credit(this.firstName, this.lastName, getDeposit());

        if (this.typeClient == 1) {
            switch (this.optionSelected) {
                case 1:
                    //search for the bank account options
                    bank.BankAccount(this.firstName, this.lastName);
                    deposit = getDeposit();
                    break;
                case 2:
                    LOGGER.info("Tuesday");
                    break;
            }
        } else {
            switch (this.optionSelected) {
                case 1:
                    deposit = getDeposit();
                    break;
                case 2:
                    LOGGER.info("Tuesday");
                    break;
            }
        }
    }

    public void setDeposit(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public double getDeposit() {
        return amountOfMoney;
    }


}