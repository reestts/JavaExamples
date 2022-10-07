package com.reestts.interfaces;

public interface TestInterface {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Hello from default method");
    }

    static void staticMethod() {
        System.out.println("Hello from static method");
    }
}
