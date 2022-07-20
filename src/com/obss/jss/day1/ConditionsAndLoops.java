package com.obss.jss.day1;

import java.util.Scanner;

public class ConditionsAndLoops {

    public static void main(String[] args) {

        // ifElseExample();
        // whileExample();
        // doWhileExample();
        // forExample();
        // switchExample();
        // breakExample();
        //continueExample();
    	averageCalculatorExample();

    }

    static void ifElseExample() {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        if (number < 50) {
            System.out.println("Number is smaller than 50");
        } else if (number < 75) {
            System.out.println("Number is smaller than 75");
        } else {
            if (number > 50) {
                System.out.println("Number is greater than 50");
            } else {
                System.out.println("Number is: " + number);
            }
        }

       /* boolean x = true, y = false;

        if(x || y) {
            System.out.println("x || y");
        } else {
            System.out.println("-");
        }*/
    }

    static void whileExample() {
        int x = 0;
        while(x < 10) {
            System.out.println(x);
            x++;
        }
    }

    static void doWhileExample() {
        double number = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            number = in.nextDouble();
        } while (number != 100);
    }

    static void forExample() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    static void switchExample() {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String str = "";

        switch (number) {
            case 10:
                str = "It is 10";
                break;
            case 20:
                str = "It is 20";
                break;
            default:
                str = "Neither 10 nor 20";
                break;
        }

        System.out.println(str);
    }

    static void breakExample() {
        /*for(int i = 0; i < 10; i++) {
            if(i == 5) 
            	break;
            System.out.println(i);
        }*/
        for( int i=0; i<5; i++) {
        	for(int j=0; j<5; j++) {
        		System.out.println("j: " + j);
        		if(j == 3) break;
        	}
        	System.out.println("i: " + i);
        }
    }

    static void continueExample() {
        for(int i = 0; i < 10; i++) {
            if(i == 5) continue;
            System.out.println(i);
        }
    }
    
    static void averageCalculatorExample() {
    	double input = 0;
        double sum = 0;
        double count = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while((input = scan.nextDouble()) != 101) {
        	sum += input;
        	count++;
        	System.out.println("Current sum is: " + sum);
        	System.out.println("Enter next number: ");
        }
        System.out.println("Average is: " + (count == 0 ? 0 : (sum / count)));
    }
}
