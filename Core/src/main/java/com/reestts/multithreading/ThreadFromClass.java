package com.reestts.multithreading;

public class ThreadFromClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from class");
    }
}