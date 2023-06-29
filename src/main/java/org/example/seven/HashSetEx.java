package org.example.seven;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Alla");
        set.add("Mars");


        for(String s : set) {
            System.out.println(s);
        }
    }
}
