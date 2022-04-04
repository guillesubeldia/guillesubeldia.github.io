package com.solvd.hierarchy;

import com.solvd.hierarchy.exception.IncorrectAmountException;
import com.solvd.hierarchy.interfaces.IBill;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.LocalDateTime.now;

public class CreditCard extends Card implements IBill {
    private static Logger LOGGER = LogManager.getLogger(Main.class);
    private LocalDateTime firstDueDate;
    private LocalDateTime secondDueDate;
    private double fullDebt;
    private double debtPayment;
    private int optionC;
    private String fullname;
    Scanner scanner = new Scanner(System.in);

    public CreditCard(String firstName, String lastName) {
        this.fullname = firstName + " " + lastName;
        this.firstDueDate = now();
        this.secondDueDate = firstDueDate.plusMonths(1);
        this.fullDebt = 5000.00;
    }

    public void creditCardMenu() {
        LOGGER.info("Hello " + fullname + " select what cards you want to check");
        LOGGER.info("1 Make payment");
        LOGGER.info("2 Search Debts");
        int optionC = scanner.nextInt();
        switch (optionC) {
            case 1:
                getCreditDebts();
                break;
            case 2:
                getFirstDueDate();
                break;
        }
    }

    public void getCreditDebts() throws IncorrectAmountException {
        LOGGER.info("You have a debt of" + this.fullDebt);
        LOGGER.info("Introduce the amount of payment:");
        double debtPayment = scanner.nextDouble();

        if (debtPayment > this.fullDebt || debtPayment <= 0) {
            throw new IncorrectAmountException();
        }
        pay(debtPayment);
        finalState();
    }

    @Override
    public void pay(double amount) {
        this.fullDebt = this.fullDebt - amount;
    }

    public LocalDateTime getFirstDueDate() {
        return firstDueDate;
    }

    public void setFirstDueDate(LocalDateTime firstDueDate) {
        this.firstDueDate = firstDueDate;
    }

    public LocalDateTime getSecondDueDate() {
        return secondDueDate;
    }

    public void setSecondDueDate(LocalDateTime secondDueDate) {
        this.secondDueDate = secondDueDate;
    }

    public void finalState() {
        if (this.fullDebt == 0) {
            LOGGER.info("You dont have any debt.");
        } else {
            LOGGER.info("Now your debt is: " + this.fullDebt);
        }
        LOGGER.info("Goodbye");
    }
}
