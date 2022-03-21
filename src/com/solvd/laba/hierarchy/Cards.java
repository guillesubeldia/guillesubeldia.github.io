package com.solvd.laba.hierarchy;

import java.util.Scanner;

public class Cards extends Credit{
    private String firstName;
    private String lastName;
    private int optionSelected;


    public void Cards(String firstName, String lastName){


        Scanner scanner = new Scanner(System.in);
        this.firstName = firstName;
        this.lastName = lastName;

        DebitCards debit = new DebitCards(firstName, lastName);


        System.out.println("Hello "+firstName+ " select what cards you want to check");
        System.out.println("1 Credit Card");
        System.out.println("2 Debit Cards");
        int optionSelected = scanner.nextInt();
        switch (optionSelected){
            case 1:

                break;
            case 2:
                System.out.println(debit.getDebitCards());
                break;

        }

    }

//    public int getCards(int optionSelected){
//        this.optionSelected = optionSelected;
//    }

    public void setCards(){


    }

    public void getTypeOfCards(){

    }

    public void setTypeOfCards(){

    }

}
