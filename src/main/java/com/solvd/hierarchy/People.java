package com.solvd.hierarchy;

public abstract class People {

    protected String firstName;
    protected String lastName;

    public People() {

    }

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
