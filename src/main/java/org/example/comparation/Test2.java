package org.example.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        Employee emp1 = new Employee(100, "Mars", "Nevred", 3000);
        Employee emp2 = new Employee(101, "Alex", "Nevr", 35000);
        Employee emp3 = new Employee(102, "Alla", "Nev", 30000);

        listEmp.add(emp1);
        listEmp.add(emp2);
        listEmp.add(emp3);

        System.out.println("До сортировки " + listEmp);

        Collections.sort(listEmp, new SalaryComparator());
        System.out.println("После сортировки " + listEmp);
    }
}

class Employee  {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int compareTo(Employee anotherEmp) {
//        return this.id - anotherEmp.id;
//    }
}



class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.surname.compareTo(emp2.surname);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}