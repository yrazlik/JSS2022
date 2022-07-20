package com.obss.jss.day3.exceptionhandling;

public class StringTooLongExceptionMain3 {

    public static void main(String[] args) {

        try {
            boolean isValid = isValidString("abcdefg");
        } catch (StringTooLongException3 e) {
            System.err.println(e.toString());
        }
    }

    private static boolean isValidString(String str) throws StringTooLongException3 {
        if(str != null && str.length() > 5) {
            throw new StringTooLongException3();
            //throw new StringTooLongException3("String length cannot be greater than 5");
        }

        return true;
    }
}
