package com.obss.jss.day1;

public class StackVsHeap {

    static class Person {
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class PersonBuilder {
        private static Person buildPerson(int id, String name) {
            return new Person(id, name);
        }

        public static void main(String[] args) {
            int id = 23;
            String name = "John";

            Person person = null;
            person = buildPerson(id, name);
            System.out.println(person);
        }
    }
}

/**
 * Let's analyze this step-by-step:
 *
 * Upon entering the main() method, a space in stack memory would be created to store primitives and references
 * of this method
 * The primitive value of integer id will be stored directly in stack memory
 * The reference variable person of type Person will also be created in stack memory which will point to the actual
 * object in the heap
 * The call to the parameterized constructor Person(int, String) from main() will allocate further memory on top of
 * the previous stack. This will store:
 * The this object reference of the calling object in stack memory
 * The primitive value id in the stack memory
 * The reference variable of String argument name which will point to the actual string from string pool in heap memory
 * The main method is further calling the buildPerson() static method, for which further allocation will take place
 * in stack memory on top of the previous one. This will again store variables in the manner described above.
 * However, for the newly created object person of type Person, all instance variables will be stored in heap memory.
 * This allocation is explained in this diagram:
 */