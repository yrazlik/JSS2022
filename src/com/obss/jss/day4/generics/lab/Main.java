package com.obss.jss.day4.generics.lab;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InvalidProductTypeException {
        Product computer = new Computer("Macbook", 1, 1000, 50, 20);
        Product dress = new Dress("Sundress", 2, 300, "M");

        ShoppingBasket<Product> basket = new ShoppingBasket<>();
        basket.addToBasket(computer);
        basket.addToBasket(dress);
        
        List<Product> products = basket.getBasketItems();
        System.out.println(products);
        
    }
}
