package org.example.two;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double salaryTwo() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Alexeev", 29, 202.5, "IT");
        Employee employee2 = new Employee(1, "Marsov", 29, 252.5, "Sales");

        employee1.salaryTwo();
        System.out.println("New zarplata rebotnika " + employee1.surname + ": " + employee1.salary);

        double newSalary = employee2.salaryTwo();
        System.out.println("New zarplata rabotnika " + employee2.surname + ": " + newSalary);
    }
}