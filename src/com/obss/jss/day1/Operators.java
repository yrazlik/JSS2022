package com.obss.jss.day1;

public class Operators {

    public static void main(String[] args) {

        int firstNumber = 11;
        int secondNumber = 5;
        double thirdNumber = 90.0;


        System.out.println("********** Addition **********");
        System.out.println(firstNumber + secondNumber);
        System.out.println("********** Subtraction **********");
        System.out.println(firstNumber - secondNumber);
        System.out.println("********** Multiplication **********");
        System.out.println(firstNumber * secondNumber);
        System.out.println("********** Integer Division **********");
        System.out.println(firstNumber / secondNumber);
        System.out.println("********** Double Division **********");
        System.out.println(thirdNumber / firstNumber);
        System.out.println("********** Mod **********");
        System.out.println(thirdNumber % firstNumber);

        System.out.println("********** Increment first number and then print **********");
        System.out.println(++firstNumber);
        System.out.println("********** Print first number and then increment **********");
        System.out.println(firstNumber++);
        System.out.println("********** First number prints incremented value **********");
        System.out.println(firstNumber);
        System.out.println("********** = **********");
        firstNumber = 11;
        System.out.println(firstNumber);
        System.out.println("********** += **********");
        System.out.println(firstNumber += 5);

        boolean fast = true, furious = false;
        System.out.println("********** AND **********");
        System.out.println(fast && furious);
        System.out.println("********** OR **********");
        System.out.println(fast || furious);

        System.out.println("********** < **********");
        System.out.println(firstNumber < secondNumber);
        System.out.println("********** >= **********");
        System.out.println(firstNumber >= secondNumber);
        System.out.println("********** == **********");
        System.out.println(firstNumber == secondNumber);
        System.out.println("********** != **********");
        System.out.println(firstNumber != secondNumber);

        System.out.println("********** Without parentheses **********");
        System.out.println(1+2*3);
        System.out.println("********** With parentheses **********");
        System.out.println((1+2)*3);

        int  x=8;
        x+=5;
        System.out.println(x);
    }
}
