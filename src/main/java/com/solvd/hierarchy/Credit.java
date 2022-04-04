package com.solvd.hierarchy;

import com.solvd.hierarchy.interfaces.IBill;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Credit extends Service implements IBill {
    private static Logger LOGGER = LogManager.getLogger(Main.class);
    //the amount of credit of a person, depending of his savings/incomings
    private String firstName;
    private String lastName;
    private double balance;
    private double creditCuantity;

    public void Credit(String firstName, String lastName, double balance) {
        //for the "credit" we can give the actual balance * 3
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        LOGGER.info("Our Client " + this.firstName + ", " + this.lastName + " can get a credit of: " + generateCredit(this.balance));
    }

    public Double generateCredit(double balance) {
        this.creditCuantity = balance * 3;
        return creditCuantity;
    }

    @Override
    public void pay(double amount) {
        balance = balance - amount;
    }

}
