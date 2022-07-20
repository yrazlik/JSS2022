package com.obss.jss.day4.innerclass;

public class OuterClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class InnerClass {

        public void printName() {
            System.out.println(name);
        }
    }


    class InnerClass2 {

    }

    void callInnerClassFunction() {
        InnerClass innerClass = new InnerClass();
        innerClass.printName();
    }
}
