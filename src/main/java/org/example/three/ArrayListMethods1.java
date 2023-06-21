package org.example.three;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex"); //add добавляет элемент в лист
        arrayList.add("Alla");
        arrayList.add("Mars");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println(arrayList.get(2)); //get вытаскивает из листа элемент

        arrayList.set(2, "Zuzzha");
        System.out.println(arrayList); //set заменяет указанный элемент в листе

        arrayList.remove(0);
        System.out.println(arrayList);// remove удаляет элемент по индексу
    }
}
