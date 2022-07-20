package com.obss.jss.day4.generics.genericclass;

public class AccountsResponse {

    private String accountNo;
    private double balance;

    public AccountsResponse(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{ \"accountNo\": " + accountNo + ", \"balance\": " + balance + "}";
    }
}
