package com.obss.jss.day4.generics.wildcards.upperboundedvspolymorphic;

public class Cat extends Animal{

    private String sound;

    public Cat(int age, String sound) {
        super(age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("sound");
    }
}
