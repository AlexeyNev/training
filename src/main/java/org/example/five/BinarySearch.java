package org.example.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(122);
        arrayList.add(443);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(4);

        Collections.sort(arrayList);

        int index = Collections.binarySearch(arrayList, 122);


        Employee employee1 = new Employee(100, "Alex", 353);
        Employee employee2 = new Employee(35, "Alla", 455);
        Employee employee3 = new Employee(677, "Mars", 664);
        Employee employee4 = new Employee(33, "Petr", 235);
        Employee employee5 = new Employee(78, "Ilya", 642);
        Employee employee6 = new Employee(122, "Fedor", 3867);
        Employee employee7 = new Employee(155, "Sasha", 2355);

        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(employee1);
        listEmp.add(employee2);
        listEmp.add(employee3);
        listEmp.add(employee4);
        listEmp.add(employee5);
        listEmp.add(employee6);
        listEmp.add(employee7);


        Collections.sort(listEmp);


        int index2 = Collections.binarySearch(listEmp, new Employee(78, "Ilya", 642));

        int []array = {3, 5, 2, -1, 33, 13};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 13);
        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}