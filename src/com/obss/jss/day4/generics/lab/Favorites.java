package com.obss.jss.day4.generics.lab;

import java.util.List;

public class Favorites<T> {

    private List<T> favorites;

    public List<T> getFavorites() {
        return favorites;
    }

    public void addToFavorites(T t) {
        favorites.add(t);
    }
}
