package com.obss.jss.day4.generics.lab;

public class Dress extends Product {

    private String size;

    public Dress(int id, double price, String size) {
        super(id, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
