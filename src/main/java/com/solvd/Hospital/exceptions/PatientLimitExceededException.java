package com.solvd.Hospital.exceptions;

public class PatientLimitExceededException extends RuntimeException {
    public PatientLimitExceededException(String message) {
        super(message);
    }
}
