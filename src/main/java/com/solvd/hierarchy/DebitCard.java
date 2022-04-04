package com.solvd.hierarchy;

import java.util.concurrent.ThreadLocalRandom;

public class DebitCard extends Card {

    private String firstName;
    private String lastname;
    private int cardNumber;

    private String debitCard;

    public DebitCard(String firstName, String lastName) {
        int randomNum = ThreadLocalRandom.current().nextInt(100000000, 999999999 + 1);

        this.firstName = firstName;
        this.lastname = lastName;
        this.cardNumber = randomNum;

        setDebitCard(firstName, lastName, randomNum);
    }

    public void setDebitCard(String firstName, String lastName, int cardNumber) {
        this.debitCard = "Full name" + lastName + " " + firstName + " And the number is: " + cardNumber;

    }

    public String getDebitCard() {
        return debitCard;
    }


}
