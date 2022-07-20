package com.obss.jss.day2.enums;

public enum EnumWithConstructor {

    SMALL(1, "small"),
    MEDIUM(2, "medium"),
    LARGE(3, "large");

    private int size;
    private String name;

    private EnumWithConstructor(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
