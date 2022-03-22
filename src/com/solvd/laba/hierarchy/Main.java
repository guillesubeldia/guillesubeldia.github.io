package com.solvd.laba.hierarchy;

import com.solvd.laba.hierarchy.Exceptions.IncorrectAmountException;
import com.solvd.laba.hierarchy.Exceptions.IncorrectOperationException;
import com.solvd.laba.hierarchy.Interface.IMenu;

import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String args[]) {

        //Example Client 1/ Example Employee 2
        int typePeople = 1;
        String firstName = "Guillermo";
        String lastName = "Subeldia";

        Scanner scanner = new Scanner(System.in);

        Client p = new Client(firstName, lastName);
        Service s = new Service();
        Credit c = new Credit();
        Cards cards = new Cards();

        BankAccount b = new BankAccount();

        //set the data
        p.setTypePeople(typePeople);

        System.out.println("Please select the service you want to use:");
        System.out.println("1 - Home Banking:");
        System.out.println("2 - Credit/Debit Card");
        int optionSelected = scanner.nextInt();

        try {
            switch (optionSelected) {
                case 1:
                    //Going to do some home banking
                    s.Service(firstName, lastName, typePeople, optionSelected);
                    break;
                case 2:
                    System.out.println("1- To check the amount of money of our credit have to offer.");
                    System.out.println("2- To see the status of your cards");
                    int newOption = scanner.nextInt();
                    if (newOption == 1) {
                        c.Credit(firstName, lastName, b.getBalance());
                    } else {
                        cards.Cards(firstName, lastName);
                    }
                    break;
                default:
                    throw new IncorrectOperationException();
            }
        } catch (IncorrectOperationException e) {
            System.out.println(e.getMessage());
        }
    }


}





