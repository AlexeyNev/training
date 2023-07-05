package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mars");
        list.add("Alex");
        list.add("Alla");

        System.out.println("До сортировки " + list);
        Collections.sort(list);
        System.out.println("После сортировки " + list);
    }
}

