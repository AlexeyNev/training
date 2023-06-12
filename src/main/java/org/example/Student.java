package org.example;

public class Student {
    int studentNumber;
    String name;
    String surName;

    int yearOfStudy;

    double averageMath;

    double averageEconomics;

    double averageLang;

    public Student(int studentNumber, String name, String surName, int yearOfStudy, double averageMath, double averageEconomics, double averageLang) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surName = surName;
        this.yearOfStudy = yearOfStudy;
        this.averageMath = averageMath;
        this.averageEconomics = averageEconomics;
        this.averageLang = averageLang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", averageMath=" + averageMath +
                ", averageEconomics=" + averageEconomics +
                ", averageLang=" + averageLang +
                '}';
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public double getAverageMath() {
        return averageMath;
    }

    public double getAverageEconomics() {
        return averageEconomics;
    }

    public double getAverageLang() {
        return averageLang;
    }
}
