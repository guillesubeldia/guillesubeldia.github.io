package com.solvd.laba.hierarchy;

import java.util.Scanner;

public class BankAcount extends Service{
    private double balance;
    private String firstName;
    private String lastName;
    private int option;
    private double income;

//    Extractions ext = new Extractions();
//    Savings sav = new Savings();
//    Transfers trans = new Transfers();
//    Deposits depo = new Deposits();
//    Debts debts = new Debts();


    public void BankAcount(String firstName, String lastName){
        Scanner scanner = new Scanner(System.in);

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Welcome to yor Home Banking" +
                "\nSelect the option you want to use:");
        System.out.println("1- for check your balance.");
        System.out.println("2- for check your extractions.");
        System.out.println("3- for check your savings.");
        System.out.println("4- for check your transfers.");
        System.out.println("5- for check your deposits.");
        System.out.println("6- for check your debts.");


        this.option = scanner.nextInt();

        switch (this.option) {
            case 1:
                System.out.println(getBalance());
                break;
            case 2:
//                ext.getExtractionHistory();
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
        }

    }

    public void setBalance() {
        this.balance = 5000.00;
    }

    public double getBalance() {
        setBalance();
        return balance;
    }
}
