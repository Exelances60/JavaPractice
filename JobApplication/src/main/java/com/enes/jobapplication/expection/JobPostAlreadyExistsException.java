package com.enes.jobapplication.expection;

public class JobPostAlreadyExistsException extends RuntimeException {
    public JobPostAlreadyExistsException(String message) {
        super(message);
    }
}

