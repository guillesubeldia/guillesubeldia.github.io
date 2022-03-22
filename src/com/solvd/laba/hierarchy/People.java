package com.solvd.laba.hierarchy;

public abstract class People {

    protected String firstName;
    protected String lastName;

    public People(){

    }

    public People(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return firstName+' '+lastName;
    }

}
