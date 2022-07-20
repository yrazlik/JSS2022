package com.obss.jss.day4.innerclass;

public class Main {

    public static void main(String[] args) {
        //innerClassExample();
        //methodLocalInnerClassExample();
        anonymousInnerClassExample();
    }

    public static void innerClassExample() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass2 a = new OuterClass().new InnerClass2();
        outerClass.setName("name");
        outerClass.callInnerClassFunction();
    }

    public static void methodLocalInnerClassExample() {
        someMethod("Yasin");
    }

    public static void someMethod(String name) {
        int num = 1;

        // method-local inner class
        class MethodLocalInnerClass {
            private String str = "str";
            public void print() {
                System.out.println("Method local inner class, number and name are: " + num + name);
            }
        }

        // Accessing the inner class
        MethodLocalInnerClass innerClass = new MethodLocalInnerClass();
        innerClass.print();
    }

    public static void anonymousInnerClassExample() {
        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Clicked");
            }
        };

        onClickListener.onClick();

        notifyWhenClicked(onClickListener);
    }

    public static void notifyWhenClicked(OnClickListener onClickListener) {
        // suppose we clicked
        onClickListener.onClick();
    }
}
