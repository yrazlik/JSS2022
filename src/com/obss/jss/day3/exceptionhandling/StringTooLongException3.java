package com.obss.jss.day3.exceptionhandling;

public class StringTooLongException3 extends Exception {

    private String message;

    public StringTooLongException3() {
        message = "Max string length should be 5";
    }

    public StringTooLongException3(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "com.obss.jss.StringTooLongException: String is too long, message is: " + message;
    }
}
