package com.obss.jss.day3.collections;

public class Person implements Comparable {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(this.age == ((Person) o).getAge()) {
            return 0;
        } else if(this.age > ((Person) o).getAge()) { // object is higher
            return 1;
        } else { // object is lower
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
