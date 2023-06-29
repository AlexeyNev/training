package org.example.six;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", "Nev" , 1);
        Student student2 = new Student("Andrey", "Nev" , 3);
        Student student3 = new Student("Nata", "Nev" , 4);
        Student student4 = new Student("Alla", "Nev" , 4);

        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, false);
        linkedHashMap.put(1.0, student1);
        linkedHashMap.put(2.0, student2);
        linkedHashMap.put(3.0, student3);
        linkedHashMap.put(4.0, student4);

        System.out.println(linkedHashMap);
        /**
         * элементы в linkedHashMap идут по порядку в котором мы заполняем этот линкед хэш мап,
             то есть не идет никакая сортировка.
                все элементы имеют ссылку на последующий и предшествующий добавленный элемент.

         */
    }
}
