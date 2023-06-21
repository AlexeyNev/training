package org.example.three;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Alla");
        arrayList.add("Mars");
        System.out.println(arrayList);

        ArrayList<String> arrayLists2 = new ArrayList<>(arrayList);

        System.out.println(arrayLists2);
    }
}
