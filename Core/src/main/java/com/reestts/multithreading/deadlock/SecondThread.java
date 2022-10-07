package com.reestts.multithreading.deadlock;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("SecondThread want catch the monitor of object lock2");
        synchronized (MainDeadlock.lock2) {
            System.out.println("SecondThread catch monitor of object lock2");
            System.out.println("SecondThread want catch the monitor of object lock1");
            synchronized (MainDeadlock.lock1) {
                System.out.println("SecondThread catch monitor of objects lock1 and lock1");
            }
        }
    }
}
