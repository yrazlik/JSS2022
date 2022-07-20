package com.obss.jss.day5.transactionmanagement;

import java.math.BigDecimal;

public class Account {

    private long id;
    private String accountNo;
    private BigDecimal balance;

    public Account(long id, String accountNo, BigDecimal balance) {
        this.id = id;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
