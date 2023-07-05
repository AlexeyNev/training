package org.example.seven;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student("Alex", 1);
        Student student2 = new Student("Alla", 3);
        Student student3 = new Student("Mars", 2);
        Student student4 = new Student("Max", 4);
        Student student5 = new Student("Rex", 5);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        System.out.println(treeSet);
    };
}


class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}