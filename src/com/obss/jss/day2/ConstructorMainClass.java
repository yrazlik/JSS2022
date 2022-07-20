package com.obss.jss.day2;

public class ConstructorMainClass {

    public static void main(String[] args) {
        //compile error because we overridden the default constructor.
        ConstructorExample5 constructorExample = new ConstructorExample5();
    }
}
