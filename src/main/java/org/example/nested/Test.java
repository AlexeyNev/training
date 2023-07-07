package org.example.nested;

public class Test {
    static class A {  //статичный nested класс
        class B {   //inner класс
            void method() {
                class C {    //локальный inner класс

                }
            }
        }
    }
}
