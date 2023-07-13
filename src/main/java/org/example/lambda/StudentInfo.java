package org.example.lambda;


import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> students, StudentChecks studentChecks) {
        for (Student s: students) {
            if (studentChecks.check(s)) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 8.3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("-----");
        info.testStudents(students, s -> s.age < 30);
        System.out.println("-----");
        info.testStudents(students, s -> s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f');
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}