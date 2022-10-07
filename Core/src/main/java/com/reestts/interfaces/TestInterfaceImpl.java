package com.reestts.interfaces;

public class TestInterfaceImpl implements TestInterface {

    @Override
    public void abstractMethod() {
        System.out.println("Hello from abstract method");
    }

    @Override
    public void defaultMethod() {
        TestInterface.super.defaultMethod();
    }
}
