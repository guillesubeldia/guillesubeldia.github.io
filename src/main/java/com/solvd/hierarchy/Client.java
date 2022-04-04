package com.solvd.hierarchy;

import com.solvd.hierarchy.interfaces.IPay;

public class Client extends People implements IPay {

    private Integer typePeople;
    private String fullName;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        setFullName();
    }

    public void setTypePeople(int typePeople) {
        this.typePeople = typePeople;
    }

    public int getTypePeople() {
        return typePeople;
    }

    @Override
    public double pay() {
        return 4.0;
    }

    public void setFullName() {
        fullName = super.firstName + ", " + super.lastName;
    }

    public String getFullName() {
        return fullName;
    }
}