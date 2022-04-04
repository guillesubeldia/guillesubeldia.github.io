package com.solvd.hierarchy;

import com.solvd.hierarchy.exception.IncorrectAmountException;
import com.solvd.hierarchy.exception.IncorrectTypeDataException;
import com.solvd.hierarchy.interfaces.IMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class BankAccount extends Service implements IMenu {
    protected static Logger LOGGER = LogManager.getLogger(Main.class);
    protected Scanner scanner = new Scanner(System.in);
    protected double balance;
    private int option;
    private String firstName;
    private String lastName;
    private Extraction extractions = new Extraction();
    private Deposit deposits;

    private double income;

    public BankAccount() {

    }

    public void BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setBalance();
        try {
            bankAccountMenu();
        } catch (IncorrectTypeDataException e) {
            LOGGER.info(e.getMessage());
        }

    }

    public void bankAccountMenu() {
        Transfer transfer = new Transfer();
        Scanner scanner = new Scanner(System.in);
        Allowance allowance = new Allowance();
        Debt debt = new Debt();
        Deposit depo = new Deposit();
        Saving sav = new Saving();
        menu();

        this.option = scanner.nextInt();

        switch (this.option) {
            case 1:
                LOGGER.info(getBalance());
                bankAccountMenu();
                break;
            case 2:
                extractionsMenu();
                break;
            case 3:
                LOGGER.info(sav.getSavings());
                break;
            case 4:
                transfer.getHistoryTransfer().forEach((i, j) -> LOGGER.info("For the month of: " + i + ", you transfer this amount: " + j));
                transfer.transferMenu();
                break;

            case 5:
                depo.setDeposit(this.balance);
                depo.depositMenu();
                break;
            case 6:
                debt.getAllDebt();
                debt.debtMenu();
                break;
            case 7:
                allowance.calculateAllowance(getBalance());
                LOGGER.info("The total money of the allowance is. " + allowance.getAllowance());
                break;
        }
    }

    public void setBalance() {
        this.balance = 5000.00;
    }

    public double getBalance() {
        return balance;
    }

    public void setExtraction(Double amount) {
        try {
            if (amount > this.balance) {
                throw new IncorrectAmountException();
            }
            this.extractions.setHistory(this.balance, amount);
            this.balance -= amount;
            LOGGER.info("Your balance is: " + this.balance);
        } catch (IncorrectAmountException e) {
            LOGGER.info(e.getMessage());
        }
    }

    public void extractionsMenu() {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Select the operation: ");
        LOGGER.info("1- Make an extraction: ");
        LOGGER.info("2- Check extractions history");
        LOGGER.info("3- Go back");
        this.option = scanner.nextInt();
        switch (this.option) {
            case 1:
                LOGGER.info("Insert the amount");
                Double amount = scanner.nextDouble();
                setExtraction(amount);
                extractionsMenu();
                break;
            case 2:
                this.extractions.getHistory();
                extractionsMenu();
                break;
            case 3:
                bankAccountMenu();
        }
    }


    @Override
    public void menu() {
        LOGGER.info("Welcome to yor Home Banking" +
                "\nSelect the option you want to use:");
        LOGGER.info("1- for check your balance.");
        LOGGER.info("2- for check your extractions.");
        LOGGER.info("3- for check your savings.");
        LOGGER.info("4- for check your transfers.");
        LOGGER.info("5- for check your deposits.");
        LOGGER.info("6- for check your debts.");
        LOGGER.info("7- get an allowance.");

    }
}
