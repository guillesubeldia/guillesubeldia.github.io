package com.solvd.laba.hierarchy;

import java.util.concurrent.ThreadLocalRandom;

public class DebitCards extends Cards{

    private String firstName;
    private String lastname;
    private int cardNumber;

    private String debitCard;

    public DebitCards(String firstName, String lastName){
        int randomNum = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);


        this.firstName = firstName;
        this.lastname = lastName;
        this.cardNumber = randomNum;

        setDebitCards(firstName, lastName, randomNum);
    }

    public void setDebitCards(String firstName, String lastName, int cardNumber){
        this.debitCard = "Full name" + lastName + " " + firstName + " And the number is: " +cardNumber;

    }

    public String getDebitCards(){
        return debitCard;
    }

    
}
