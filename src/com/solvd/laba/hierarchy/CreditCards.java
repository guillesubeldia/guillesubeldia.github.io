package com.solvd.laba.hierarchy;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class CreditCards extends Cards{
    private Client client;
    private LocalDateTime firstDueDate;
    private LocalDateTime secondDueDate;

    public CreditCards(Client client){
        this.firstDueDate = now();
        this.secondDueDate = firstDueDate.plusMonths(1);

        this.client = client;
    }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

    public LocalDateTime getFirstDueDate() { return firstDueDate; }

    public void setFirstDueDate(LocalDateTime firstDueDate) { this.firstDueDate = firstDueDate; }

    public LocalDateTime getSecondDueDate() { return secondDueDate; }

    public void setSecondDueDate(LocalDateTime secondDueDate) { this.secondDueDate = secondDueDate; }



}
