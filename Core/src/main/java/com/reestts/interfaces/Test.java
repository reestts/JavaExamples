package com.reestts.interfaces;

public interface Test {

    static void method3() {
        System.out.println("Hello from method 3");
    }

    default void method2() {

    }

    void method1();
}