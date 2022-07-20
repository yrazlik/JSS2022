package com.obss.jss.day4.innerclass;

public class Main2 {

    public static void main(String[] args) {
        OuterClassWithStaticInnerClass.InnerStaticClass innerStaticClass
                = new OuterClassWithStaticInnerClass.InnerStaticClass();

        innerStaticClass.print();
    }
}
