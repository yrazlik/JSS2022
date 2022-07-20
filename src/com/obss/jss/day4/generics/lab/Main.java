package com.obss.jss.day4.generics.lab;

public class Main {

    public static void main(String[] args) {
        Product computer = new Computer(1, 1000, 50, 20);
        Product dress = new Dress(2, 300, "M");

        Favorites<Product> favorites = new Favorites<>();
        favorites.addToFavorites(computer);
        favorites.addToFavorites(dress);
    }
}
