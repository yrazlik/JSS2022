package com.obss.jss.day3.exceptionhandling;

import java.io.IOException;

public class ReThrowException4 {

    public static void main(String[] args) {

        try {
            readFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFiles() throws IOException {
        try {
            readFile();
        } catch (IOException e) {
            System.err.println("An exception occured...");
            throw e;
        }
    }

    public static void readFile() throws IOException {
        // some implementation
        boolean somethingWrong = true;
        if(somethingWrong) {
            throw new IOException("IO exeption occured");
        }
    }
}
