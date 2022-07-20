package com.obss.jss.day2.inheritance;

public class Animal {

    public static int x = 6;

    private int age;
    protected String sound;

    public Animal() {

    }

    public Animal(int age, String sound) {
        System.out.println("Inside Animal constructor");
        this.age = age;
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void makeDifferentSound() {
        System.out.println("Animal different sound");
    }

	/*@Override
	public String toString() {
		return "Animal [age=" + age + ", sound=" + sound + "]";
	}*/
}
