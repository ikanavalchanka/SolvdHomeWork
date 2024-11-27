package com.solvd.Hospital.exceptions;

public class InvalidShiftOperationException extends RuntimeException {
    public InvalidShiftOperationException(String message) {
        super(message);
    }
}