package com.obss.jss.day2.enums;

public class Main {

    public static void main(String[] args) {

        Action action = Action.DELETE;
        //Action action2 = new Action();

        switch (action) {
            case SAVE:
                System.out.println("Saving...");
                break;
            case DELETE:
                System.out.println("Deleting...");
                break;
            case UPDATE:
                System.out.println("Updating...");
                break;
            default:
                System.out.println("Nothing...");
                break;
        }

        EnumWithConstructor largeEnum = EnumWithConstructor.LARGE;
        System.out.println(largeEnum.getName());
        System.out.println(largeEnum.getSize());

        for (EnumWithConstructor en : EnumWithConstructor.values()) {
            System.out.println("Size: " + en.getSize() + ", Name: " + en.getName());
        }
        
        Coffee coffee = new Coffee();
        coffee.setSize(EnumWithConstructor.LARGE);
        
    }
}
