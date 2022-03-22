package com.solvd.laba.hierarchy;

import java.util.Scanner;
import com.solvd.laba.hierarchy.Exceptions.IncorrectAmountException;
import com.solvd.laba.hierarchy.Interface.IMenu;

public class BankAccount extends Service implements IMenu {
    protected double balance;
    private String firstName;
    private String lastName;
    private Extractions extractions = new Extractions();
    private Deposits deposits;
    private int option;
    private double income;

//    Extractions ext = new Extractions();
//    Savings sav = new Savings();
//    Transfers trans = new Transfers();
//    Deposits depo = new Deposits();
//    Debts debts = new Debts();


    public void BankAccount(String firstName, String lastName){
        Scanner scanner = new Scanner(System.in);

        this.firstName = firstName;
        this.lastName = lastName;

        setBalance();

        bankAccountMenu();

    }

    public void bankAccountMenu(){
        Scanner scanner = new Scanner(System.in);
        Allowance allowance = new Allowance();
        menu();

        this.option = scanner.nextInt();

        switch (this.option) {
            case 1:
                System.out.println(getBalance());
                bankAccountMenu();
                break;
            case 2:
                extractionsMenu();
                break;
            case 3:
//                System.out.println(sav.getSavings());
                break;
            case 4:
//                trans.getTransferList();
                break;
            case 5:
//                depo.getDepositList();
                break;
            case 6:
//                debts.getAllDebts();
                break;
            case 7:
                allowance.calculateAllowance(getBalance());
                System.out.println("The total money of the allowance is. " + allowance.getAllowance());
                    break;
        }
    }

    public void setBalance() {
        this.balance = 5000.00;
    }

    public double getBalance() {
        return balance;
    }

    public void setExtraction(Double amount){

        try{
            if(amount>this.balance){
                throw new IncorrectAmountException();
            }
            this.extractions.setHistory(this.balance, amount);
            this.balance -= amount;
            System.out.println("Your balance is: "+this.balance);
        } catch(IncorrectAmountException e) {
            System.out.println(e.getMessage());
        }


    }

    public void extractionsMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the operation: ");
        System.out.println("1- Make an extraction: ");
        System.out.println("2- Check extractions history");
        System.out.println("3- Go back");


        this.option = scanner.nextInt();

        switch (this.option){
            case 1:
                System.out.println("Insert the amount");
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
        System.out.println("Welcome to yor Home Banking" +
                "\nSelect the option you want to use:");
        System.out.println("1- for check your balance.");
        System.out.println("2- for check your extractions.");
        System.out.println("3- for check your savings.");
        System.out.println("4- for check your transfers.");
        System.out.println("5- for check your deposits.");
        System.out.println("6- for check your debts.");
        System.out.println("7- get an allowance.");

    }
}
