package com.solvd.laba.hierarchy.Exceptions;

public class IncorrectAmountException extends Exception{
    public IncorrectAmountException(){
        super("You can't do this operation. There isn't enough money in the account.");
    }
}
