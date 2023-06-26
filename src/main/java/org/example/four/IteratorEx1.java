package org.example.four;

import java.util.ArrayList;
import java.util.LinkedList;

public class IteratorEx1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex",1);
        Student student2 = new Student("Alla",3);
        Student student3 = new Student("Mars",1);
        Student student4 = new Student("Zlata",2);
        Student student5 = new Student("Max",2);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);

        Student student6 = new Student("Petr",4);
        Student student7 = new Student("Vova",2);
        studentLinkedList.add(4,student6);
        studentLinkedList.add(5,student7);
        System.out.println(studentLinkedList);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
