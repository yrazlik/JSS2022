package com.obss.jss.day1;

public class Primitives {

    public static void main(String[] args) {

        // integers
        byte signedByte = 6; // 8 bits, -128 to +127
        //byte overflow = 128; // compile error
        short signedShort = -5; // 16 bits, -2^15 to (2^15 - 1)
        int number = 10000000; // 32 bits, -2^31 to (2^31 - 1)
        long longValue = 1000000000; // 64 bits


        // character
        char character = 'a'; // 16 bits
        //char invalidCharacter = "a"; // compile error, chars are denoted between ''
        //char anotherInvalidCharacter = 'ab';


        // floats
        float decimalNumber = 5.6f; // 4 bytes
        float anotherFloat = 5f;
        anotherFloat = 6.7f;
        // https://stackoverflow.com/questions/4806944/what-is-the-difference-between-the-float-and-integer-data-type-when-the-size-is

        //float invalidDecimalNumber = 5.6; //this is a double
        double anotherDecimal = 5.6; // 8 bytes


        //boolean: only true or false. Its size is virtual machine dependent.
        boolean active = true;

    }
}
