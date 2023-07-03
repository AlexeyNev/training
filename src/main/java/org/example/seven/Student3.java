package org.example.seven;

public class Student3 {
    String name;
    String surName;
    int course;

    public Student3(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                '}';
    }
}
