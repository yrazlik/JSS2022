package com.obss.jss.day1;

import java.io.IOException;
import java.util.*;

public class ScannerExample {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);

      //  sun.tools.java.Scanner scanner2 = new sun.tools.java.Scanner();

        double firstNumber = input.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = input.nextDouble();
        input.close();
        System.out.println("Sum is: " + (firstNumber + secondNumber));
        System.out.println("Hello");
    }
}
