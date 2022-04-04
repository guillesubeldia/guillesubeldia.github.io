package com.solvd.hierarchy.exception;

public class IncorrectTypeDataException extends RuntimeException {
    public IncorrectTypeDataException() {
        super("This program expected another type of data.");
    }
}
