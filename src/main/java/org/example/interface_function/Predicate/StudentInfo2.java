package org.example.interface_function.Predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo2 {
    void testStudents2(ArrayList<Student2> students, Predicate<Student2> predicate) {
        for (Student2 s: students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        Student2 student1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 student2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 student3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 student4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 student5 = new Student2("Mariya", 'f', 23, 3, 8.3);

        ArrayList<Student2> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


//        interface StudentChecks {
//            boolean check(Student s);
//        } Интерфейс Predicate<> работает в точности так же

        StudentInfo2 info2 = new StudentInfo2();
        info2.testStudents2(students, s -> s.avgGrade > 8);
        info2.testStudents2(students, s -> s.age > 30);
    }
}
