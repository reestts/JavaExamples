package com.reestts.concurrency.create;

public class ThreadFromClass extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from class");
    }
}
