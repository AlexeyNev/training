package org.example.one;

import org.example.one.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Nevr", 2, 5.4, 5.2, 4.2);
        System.out.println("средняя оценка студента " + student1.name + " " + student1.surName + " = " + (student1.averageEconomics + student1.averageMath + student1.averageLang) / 3);

        Student student2 = new Student(2, "Alla", "Gorb", 1, 4.9, 5.3, 6.1);
        System.out.println("средняя оценка студента " + student2.name + " " + student2.surName + " = " + (student2.averageEconomics + student2.averageMath + student2.averageLang) / 3);

        Student student3 = new Student(3, "Marsic", "Marsov", 1, 6.1, 3.9, 2.9);
        System.out.println("средняя оценка студента " + student3.name + " " + student3.surName + " = " + (student3.averageEconomics + student3.averageMath + student3.averageLang) / 3);
    }
}
