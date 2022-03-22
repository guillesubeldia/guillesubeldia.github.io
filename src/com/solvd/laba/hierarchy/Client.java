package com.solvd.laba.hierarchy;

public class Client extends People{

    private Integer typePeople;

    public Client(){

    }

    public Client(String firstName,String lastName){
        super(firstName,lastName);
    }

    public Client(String firstName,String lastName,Integer typePeople){
        super(firstName,lastName);
        this.typePeople = typePeople;
    }

    public void setTypePeople(int typePeople){ this.typePeople = typePeople;}

    public int getTypePeople(){ return typePeople;}

    public void setClientId(){

    }

    public void getClientId(){

    }

}