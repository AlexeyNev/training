package org.example.interface_function;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("GoodBye");
        arrayList.add("Nice day");
        arrayList.add("Ok");

        arrayList.removeIf(a -> a.length() < 5);
        System.out.println(arrayList);
    }
}
