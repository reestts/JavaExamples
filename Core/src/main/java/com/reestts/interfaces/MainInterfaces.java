package com.reestts.interfaces;

public class MainInterfaces implements TestInterface {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        TestInterface.super.method2();
    }

    public static void main(String[] args) {
        TestInterface.method3();
    }
}
