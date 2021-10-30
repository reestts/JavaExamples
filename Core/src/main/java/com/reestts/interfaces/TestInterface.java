package com.reestts.interfaces;

public interface TestInterface {

    void method1();

    default void method2() {
        System.out.println("Hello from default method");
    }

    static void method3() {
        System.out.println("Hello from static method");
    }
}