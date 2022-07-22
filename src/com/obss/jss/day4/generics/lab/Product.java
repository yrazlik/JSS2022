package com.obss.jss.day4.generics.lab;

public class Product {

	protected String name;
	protected int id;
    protected double price;

    public Product(String name, int id, double price) {
    	this.name = name;
        this.id = id;
        this.price = price;
    }
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
    	return name;
    }
}
