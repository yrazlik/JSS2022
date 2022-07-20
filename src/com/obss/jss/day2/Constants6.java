package com.obss.jss.day2;

public class Constants6 {

    private static final double PI = 3.14;

    public static void main(String[] args) {

        // PI = 10; // compile error

         Account account = new Account();
    }

    static class Account {
        private final int maxBalance = 100;

        public Account() {
            //maxBalance = 100;
        }

        public  Account(int maxBalance) {
            //this.maxBalance = maxBalance;
        }

        public int getMaxBalance() {
            return maxBalance;
        }
    }
}
