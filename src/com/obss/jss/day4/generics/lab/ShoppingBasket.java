package com.obss.jss.day4.generics.lab;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket<T> {

    private List<T> basketItems = new ArrayList<T>();

    public List<T> getBasketItems() {
        return basketItems;
    }

    public void addToBasket(T t) throws InvalidProductTypeException{
    	if(t instanceof Electronics) {
        	basketItems.add(t);
    	} else {
    		throw new InvalidProductTypeException("Product type should be electonics or its subclass");
    	}
    }
    
}
