package org.example.seven;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(2);
        hashSet1.add(5);
        hashSet1.add(4);
        hashSet1.add(7);
        hashSet1.add(91);


        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(12);
        hashSet2.add(10);
        hashSet2.add(91);


        Set<Integer> union = new HashSet<>(hashSet1); //union соединение hashSet. Множество
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1); //intersect пересечение hashSet. Пересечение множеств
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        Set<Integer> subtract = new HashSet<>(hashSet1); //subtract разность множества hashset. Разность множества
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }
}
