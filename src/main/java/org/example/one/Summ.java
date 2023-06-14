package org.example.one;

public class Summ {
    int sum() {
        int result = 0;
        System.out.println("sum of all numbers" + " " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("sum of all numbers" + " " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("sum of all numbers" + " " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("sum of all numbers" + " " + result3);
        return result3;
    }

    int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("sum of all numbers" + " " + result4);
        return result4;
    }
}

class SummTest {
    public static void main(String[] args) {
        Summ summ = new Summ();
        summ.sum();
        summ.sum(3);
        summ.sum(3, 5);
        summ.sum(3, 5, 7);
        summ.sum(3, 5, 7, 11);
    }
}