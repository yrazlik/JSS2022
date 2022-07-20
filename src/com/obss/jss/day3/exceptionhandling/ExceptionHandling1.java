package com.obss.jss.day3.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {

    public static void main(String[] args) {

        //nullPointerExceptionExample();
        finallyExample();
        // finallyWithoutCatchExample();
        // uncaughtExceptionExample();
       // multiCatchExample();


    }

    private static void nullPointerExceptionExample() {
        String str = null;

        try {
            str.substring(0, 2);
            str = "abc";
            System.out.println(str);
        } catch (Exception e) {
            System.err.println("An exception occured: " + e.toString());
        }
    }

    private static void finallyExample() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            
            int number = scan.nextInt(); // type a string instead of an integer
            return;
        } catch (Exception e) {
            System.err.println("An exception occured: " + e.toString());
        } finally {
            System.out.println("Scanner is closed");
            scan.close();
        }
    }

    private static void finallyWithoutCatchExample() {
        int x = 5, y = 0;

        try {
            int z = x / y;
        } finally {
            System.out.println("Finally block still executed before exception is thrown");
        }
    }

    private static void  uncaughtExceptionExample() {
        int x = 5, y = 0;
        try {
            int z = x / y;
        } catch (NullPointerException | ArithmeticException e) { // only catches NullPointerException, ArithmeticException is not caught
            System.err.println("An exception occured: " + e.toString());
        }
    }

    private static void multiCatchExample() {
        int x = 5, y = 0;
        try {
            int z = x / y;
        } catch (NullPointerException e) { // only catches NullPointerException, ArithmeticException is not caught
            System.err.println("A NullPointerException caught : " + e.toString());
        } catch (ArithmeticException e) {
            System.err.println("An ArithmeticException caught : " + e.toString());
        } /* finally {
            // can also add finally block
        } */
    }
}
