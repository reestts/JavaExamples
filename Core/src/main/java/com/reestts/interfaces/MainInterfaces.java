package com.reestts.interfaces;

public class MainInterfaces {

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterfaceImpl();

        testInterface.abstractMethod();
        testInterface.defaultMethod();

        TestInterface.staticMethod();
    }
}
