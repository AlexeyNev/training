package org.example.two;

public class BankAccount {
    int id = 10;
    String name = "Alex";
    double balance = 100;


    void popolnenieScheta(double summaPopolneniya) {
        System.out.println("balance do popolneniya: " + balance);
        System.out.println("balance popolnyaetsya na: " + summaPopolneniya);
        balance +=summaPopolneniya;
        System.out.println("balance posle popolneninya: " + balance);
        System.out.println();
    }

    void snytieSoScheta(double summaSnyatiya) {
        System.out.println("balance do snyatiya: " + balance);
        System.out.println("balance umenshaetsya na: " + balance);
        balance -= summaSnyatiya;
        System.out.println("balance posle snyatiya: " + balance);
        System.out.println();
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.popolnenieScheta(30.5);
        bankAccount.snytieSoScheta(20.5);
    }
}