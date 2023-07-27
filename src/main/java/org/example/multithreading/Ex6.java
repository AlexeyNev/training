package org.example.multithreading;

public class Ex6 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            }   catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread();
    }
}