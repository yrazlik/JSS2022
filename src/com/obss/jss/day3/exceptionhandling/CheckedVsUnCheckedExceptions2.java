package com.obss.jss.day3.exceptionhandling;

import java.io.IOException;

public class CheckedVsUnCheckedExceptions2 {

    public static void main(String[] args) {

    	try {
    		int result = divide(5, 0);
    	} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
        

        // readFile(); // checked exception is thrown, must be handled

        
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int divide(int num1, int num2)  {
    	int result = num1 / num2;
    	throw new ArithmeticException();
        //return result;
    }

    public static void readFile() throws IOException {
        // some implementation
    	throw new IOException("File not found");
    }
}
