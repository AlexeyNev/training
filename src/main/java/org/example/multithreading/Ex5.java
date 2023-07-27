package org.example.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("name " + myThread5.getName());
        System.out.println("priority " + myThread5.getPriority());

        myThread5.setName("Yo");
        System.out.println("name " + myThread5.getName());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello!");
    }
}