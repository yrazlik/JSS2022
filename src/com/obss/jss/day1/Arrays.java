package com.obss.jss.day1;

public class Arrays {

    public static void main(String[] args) {
        //oneDimensionalArrayExample();
        twoDimensionalArrayExample();
    }

    static void oneDimensionalArrayExample() {
        int [] numbers = {1, 2, 3, 4, 5};
        int [] otherNumbers = new int[2];
        otherNumbers[0] = 6;
        otherNumbers[1] = 7;

        System.out.println("Numbers are: ");
        for(int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Other numbers are: ");
        for(int i = 0; i < otherNumbers.length; i++) {
            System.out.println(otherNumbers[i]);
        }
    }

    static void twoDimensionalArrayExample() {
        int [][] twoDimensionalArray = new int[2][5];
        twoDimensionalArray[0][0] = 1;
        twoDimensionalArray[0][1] = 2;
        twoDimensionalArray[0][2] = 3;
        twoDimensionalArray[0][3] = 4;
        twoDimensionalArray[0][4] = 5;

        twoDimensionalArray[1][0] = 6;
        twoDimensionalArray[1][1] = 7;
        twoDimensionalArray[1][2] = 8;
        twoDimensionalArray[1][3] = 9;
        twoDimensionalArray[1][4] = 10;

        // 1 2 3 4 5
        // 6 7 8 9 10
        for(int i=0; i<twoDimensionalArray.length; i++) {
            for(int j=0; j<twoDimensionalArray[i].length; j++) {
                System.out.println("Values at arr[" + i + "][" + j + "] is " + twoDimensionalArray[i][j]);
            }
        }
    }
}
