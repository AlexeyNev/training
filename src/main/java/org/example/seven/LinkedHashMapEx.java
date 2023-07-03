package org.example.seven;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<Double, Student3> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);

        Student3 student1 = new Student3("Alex", "Nev", 2);
        Student3 student2 = new Student3("Alla", "Nev", 4);
        Student3 student3 = new Student3("Mars", "Nev", 1);

        linkedHashMap.put(1.2, student1);
        linkedHashMap.put(2.0, student2);
        linkedHashMap.put(3.0, student3);

        System.out.println(linkedHashMap);
    }
}
