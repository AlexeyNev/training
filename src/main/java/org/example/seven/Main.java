package org.example.seven;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(345632, "Катков Евгений Геннадьевич");
        map.put(345256, "Петров Михаил Петрович");
        map.put(365632, "Сидоров Павел Евгеньевич");

//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.replace(345632, "Евгеньев Евгений Павлович"));
//        System.out.println(map);

        map.put(478256, "Пупкин Василий Андреевич");
        map.put(305632, "Антохин Юрий Леонидович");

//        for (String s : map.values()) {
//            System.out.println(s);
//        }

//        for (Map.Entry<Integer, String> item : map.entrySet()) {
//            System.out.println(" ключ: " + item.getKey() + " значение: " + item.getValue());
//        }


        Map<String, Integer> map1 = new HashMap<>(); //ХРАНИТ ЗНАЧЕНИЯ В СЛУЧАЙНОМ ПОРЯДКЕ
        Map<String, Integer> map2 = new TreeMap<>(); //ХРАНИТ ЗНАЧЕНИЯ ТАК КАК МЫ ИХ ПЕРЕДАЛИ
        Map<String, Integer> map3 = new LinkedHashMap<>(); //ЗНАЧЕНИЯ БУДЕТ СОРТИРОВАТЬ

    }
}
