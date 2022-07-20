package com.obss.jss.day3.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("11111111");
        account.setBalance(1000);

        Person person = new Person();
        person.setName("Yasin");
        person.setSurname("Razlık");
        person.setAccount(account);

        FileOutputStream fos = null;

        // serialize
        try {
            fos = new FileOutputStream("/Users/yrazlik/Projects/jss2022/JSS2022/src/com/obss/jss/day3/serialization/serialized.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO exception: " + e.toString());
        }

        //deserialize

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/Users/yrazlik/Projects/jss2022/JSS2022/src/com/obss/jss/day3/serialization/serialized.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p.getName());

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IOException: " + e.toString());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.toString());
        }

    }
}
