package com.obss.jss.day2.inheritance;

public class Cat extends Animal {

    private String colorOfFur;

    public Cat(int age, String sound) {
        super(age, sound);
        System.out.println("Inside Cat constructor");
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public void setColorOfFur(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    @Override
    public void makeDifferentSound() {
        System.out.println("Cat different sound");
    }

    public void makeCatSound() {
        System.out.println("Cat sound");
    }

	@Override
	public String toString() {
		return "Cat [colorOfFur=" + colorOfFur + "]";
	}
}
