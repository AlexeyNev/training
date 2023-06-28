package org.example.six;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Alex", "Nev", 1);
        Student student2 = new Student("Andrey", "Nev", 3);
        Student student3 = new Student("Nataly", "Nev", 4);
        Student student4 = new Student("Leonid", "Nev", 5);
        Student student5 = new Student("Lydmila", "Nev", 5);
        Student student6 = new Student("Max", "Dor", 2);
        Student student7 = new Student("Alla", "Gorb", 4);

        Student student8 = new Student("Max", "Dor", 2);

        treeMap.put(3.0, student6);
        treeMap.put(4.5, student1);
        treeMap.put(5.0, student7);
        treeMap.put(4.3, student2);
        treeMap.put(3.9, student4);
        treeMap.put(3.5, student3);
        treeMap.put(4.0, student5);

        treeMap.put(3.1, student8);

        System.out.println(treeMap);
        System.out.println(treeMap.get(5.0));
        treeMap.remove(3.1);
        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(4.5));

        /*
        TreeMap используется для поиска каких либо отрезков в мапе,
        например с помощью метода tailMap
         */
    }
}
