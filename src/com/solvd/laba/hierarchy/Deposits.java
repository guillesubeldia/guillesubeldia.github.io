package com.solvd.laba.hierarchy;

public class Deposits extends BankAcount{
    private double amountMoney;
    public Deposits(){
        super();

    }

    public void setDeposit(double amountMoney) {
        this.amountMoney = amountMoney;
    }

    public double getDeposit() {
        return amountMoney;
    }

    public void getDepositList(){

    }

}