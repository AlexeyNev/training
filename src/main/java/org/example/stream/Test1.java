package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Alex");
//        list.add("Hi");
//        list.add("Oke");
//        list.add("Happy nice day");
//
//        List<Integer> list2 = list.stream().map(e -> e.length())
//                .collect(Collectors.toList());
//
//        System.out.println(list2);


        Set<String> set = new TreeSet<>();
        set.add("Alex");
        set.add("Hi");
        set.add("Oke");
        set.add("Happy nice day");

        System.out.println(set);

        Set<Integer> set1 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set1);
    }
}
