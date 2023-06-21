package org.example.three;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alex");
        arrayList.add("Alla");
        arrayList.add("Mars");
        arrayList.add("Zuzha");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Mars");
        arrayList1.add("Zuzha");
        arrayList1.add("Igor");

        arrayList1.removeAll(arrayList);// удаление всех одинаковых элементов в листе

        System.out.println(arrayList);
        System.out.println(arrayList1);
    }
}
