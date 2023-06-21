package org.example.three;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex"); //add добавляет элемент в лист
        arrayList.add("Alla");
        arrayList.add("Mars");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(0, arrayList); //addAll обавляет в лист другой лист
        System.out.println(arrayList2);

        arrayList.clear(); //clear очищение листа
        System.out.println(arrayList);

    }
}
