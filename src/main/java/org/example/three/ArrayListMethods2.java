package org.example.three;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student student1 = new Student("ALex", 'm', 29, 3, 5.2);
        Student student2 = new Student("Alla", 'f', 26, 2, 5.1);
        Student student3 = new Student("Marsik", 'm', 5, 2,5.0);
        Student student4 = new Student("Petr", 'm', 4, 1, 4.5);
        Student student5 = new Student("Zlata", 'f', 14, 1, 4.9);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        System.out.println(arrayList);

        Student student6 = new Student("Zlata", 'f', 14, 1, 4.9);
        arrayList.remove(student6);
        System.out.println(arrayList);


        System.out.println(arrayList.indexOf(student6));
        //indexOf сравнивает есть ли одинаковые объекты в листе, если они есть - возвращает индекс, если нет -1
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
