package org.example.six;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Alex", "Nev" , 1);
        Student student2 = new Student("Andrey", "Nev" , 3);
        Student student3 = new Student("Natalya", "Nev" , 4);

        map.put(student1, 4.3);
        map.put(student2, 4.4);
        map.put(student3, 4.5);
        System.out.println(map);


        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map <Integer, String> map1 = new HashMap<>(16, 0.75f);

    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}