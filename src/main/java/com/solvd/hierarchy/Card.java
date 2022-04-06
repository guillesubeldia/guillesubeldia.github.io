package com.solvd.hierarchy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Card extends Credit {
    private static Logger LOGGER = LogManager.getLogger(Main.class);
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int optionSelected;


    public void Card(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        DebitCard debit = new DebitCard(firstName, lastName);
        CreditCard credit = new CreditCard(firstName, lastName);


        LOGGER.info("Hello " + firstName + " select what cards you want to check");
        LOGGER.info("1 Credit Card");
        LOGGER.info("2 Debit Cards");
        int optionSelected = scanner.nextInt();
        switch (optionSelected) {
            case 1:
                credit.creditCardMenu();
                break;
            case 2:
                LOGGER.info(debit.getDebitCard());
                break;
        }

    }
}
