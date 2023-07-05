package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Alex alex = new Alex("Alex3", 40);
        Alex alex1 = new Alex("Alex2", 35);
        Alex alex2 = new Alex("Alex", 29);



        List<Alex> list = new ArrayList<>();
        list.add(alex);
        list.add(alex1);
        list.add(alex2);

        System.out.println("До " + list);
        Collections.sort(list);
        System.out.println("После " + list);
    }
}

class Alex implements Comparable<Alex> {
    String name;
    int age;

    public Alex(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Alex{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Alex o) {
        return this.age - o.age;
    }
}