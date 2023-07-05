package org.example.seven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * И Set(HashSet) и List(ArrayList) это множества
 */
public class Main2 {
    public static void main(String[] args) {
        Set<String> ourSet = new HashSet<>(); //только уникальные значения
        ourSet.add("str1");
        ourSet.add("str1");
        ourSet.add("str1");
//        System.out.println(ourSet);
//        System.out.println(ourSet.getClass());//получить элемент через get нельзя
//        System.out.println(ourSet.contains("str1"));//проверка есть ли переменная в Set или нет

//        for (String s : ourSet) {
//            System.out.println(s);
//        }


        List<String> list2 = new ArrayList<>(ourSet);
        System.out.println(list2);


        List<String> list = new ArrayList<>(); //не только уникальные значения
        list.add("str1");
        list.add("str1");
        list.add("str1");
//        System.out.println(list);
//        System.out.println(list.get(0));//получить элемент через get можно
    }
}
