package org.example.two;

public class Employee2 {
    Employee2(int id2, String surname2, int age2) {
        this(surname2, age2);
        id = id2;
    }

    Employee2(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    public Employee2(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class Employee2Test {
    public static void main(String[] args) {

    }
}
