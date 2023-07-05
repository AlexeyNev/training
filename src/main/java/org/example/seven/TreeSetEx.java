package org.example.seven;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(-1);


        System.out.println(treeSet);
        treeSet.remove(-1);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));
    }
}
