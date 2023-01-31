package com.paulo.devdojo.m03_exceptions.domain;

public class InvalidUserException extends Exception{
    private String message;

    public InvalidUserException() {}

    public InvalidUserException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
