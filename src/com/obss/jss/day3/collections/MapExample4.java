package com.obss.jss.day3.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample4 {

    public static void main(String[] args) {
        Map<Integer, Account> map = new HashMap<>();

        Account acc1 = new Account(1, "11111");
        Account acc2 = new Account(2, "222222");
        Account acc3 = new Account(2, "333333");

        map.put(acc1.getId(), acc1);
        map.put(acc2.getId(), acc2);
        map.put(acc3.getId(), acc3);

        System.out.println(map.get(2).getAccountNo());
        System.out.println(map);

    }
}
