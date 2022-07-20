package com.obss.jss.day3.collections;

public class Account {

    private Integer id;
    private String accountNo;

    public Account(Integer id, String accountNo) {
        this.id = id;
        this.accountNo = accountNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }
}
