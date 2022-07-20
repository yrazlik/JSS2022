package com.obss.jss.day2;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1, 2, 3, 4));
    }

    public static int sum(int x, int y) {
        System.out.println("Inside 2 parameter function");
        return x + y;
    }

    public static int sum(int ... numbers) {
        System.out.println("Inside multiple parameter function");

        int sum = 0;
        for(int number : numbers) {
            sum +=  number;
        }
        return sum;
    }
}
