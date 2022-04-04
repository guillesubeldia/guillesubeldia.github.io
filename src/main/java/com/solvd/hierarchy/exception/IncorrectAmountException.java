package com.solvd.hierarchy.exception;

public class IncorrectAmountException extends RuntimeException {
    public IncorrectAmountException() {
        super("You can't do this operation.");
    }
}
