package com.obss.jss.day2;

public class Methods2 {

    public static void main(String[] args) {
        System.out.println(multiply(4, 5));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public static int multiply (int x, int y) {
        return x * y;
    }

    public static int sum(int ...numbers/*, double d*/) { // only once, and last parameter
        int sum = 0;

        System.out.println("First parameter value is: " + numbers[0]);

        for(int number : numbers) {
            sum += number;
        }
        
        for(int i = 0; i < 5; i++) {
        	i++;
        }
        //i++;
        return sum;
    }
}
