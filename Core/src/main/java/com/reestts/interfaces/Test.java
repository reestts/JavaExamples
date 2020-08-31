package com.reestts.interfaces;

public interface Test {

    void method1();

    default void method2() {

    }

    static void method3() {
        System.out.println("Hello from method 3");
    }
}