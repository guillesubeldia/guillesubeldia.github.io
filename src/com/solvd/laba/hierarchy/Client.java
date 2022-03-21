package com.solvd.laba.hierarchy;

public class Client extends People{

    private String name;
    private String surname;
    private int typePeople;

    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return surname;
    }

    public void setTypePeople(int typePeople){ this.typePeople = typePeople;}

    public int getTypePeople(){ return typePeople;}


    public void depositMoney(Deposits deposits){

        double amountMoney = deposits.getDeposit();

    }

    public void setClientId(){

    }

    public void getClientId(){

    }

}