package org.example.two;

public class MethodOverLoading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(int i1, int i2) {
        System.out.println(i1 + i2);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }

}

class MethodOverLoadingTest {
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.show(100,4);
    }
}