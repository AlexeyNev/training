package org.example.six;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Alex");
        map1.put(1043, "Alla");
        map1.put(1006, "Mars");
        map1.putIfAbsent(1006, " Mars");
        System.out.println(map1);
        System.out.println(map1.get(1043));
        System.out.println(map1.containsValue("Mars"));
        System.out.println(map1.containsKey(100));
        System.out.println();
    }
}
