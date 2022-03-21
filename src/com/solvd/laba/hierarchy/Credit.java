package com.solvd.laba.hierarchy;

public class Credit extends Service{
    //the amount of credit of a person, depending of his savings/incomings
    private String firstName;
    private String lastName;
    private double balance;
    private double creditCuantity;

    public void Credit(String firstName, String lastName, double balance){
        //for the "credit" we can give the actual balance * 3
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        System.out.println("Our Client " + this.firstName +", "+this.lastName+" can get a credit of: " + generateCredit(this.balance));
    }

    public Double generateCredit(double balance){
        this.creditCuantity = balance * 3;

        return creditCuantity;
    }

    public void getCredit(){

    }

//    public String setCredit(){
//
//    }

}
