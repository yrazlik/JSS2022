package com.obss.jss.day1;

public class Comments {

    public static void main(String[] args) {

        // Prints hello world to the terminal
        /*
        Prints the given parameter to terminal
        sdjfjflasş
         */
        System.out.println("Hello World");

        /* Multi line comments in Java start with /* and end with */
        /*
         *   Multi
         *   line
         *   comment.
         */
        printToTerminal("Hello World Function");
    }

    /**
     * 
     * Prints to console.
     * @param word any string to be printed to terminal
     */
    public static void printToTerminal(String word) {
        System.out.println(word);
    }
}
