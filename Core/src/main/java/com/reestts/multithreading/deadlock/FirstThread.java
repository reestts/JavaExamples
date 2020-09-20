package com.reestts.multithreading.deadlock;

public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("FirstThread want catch the monitor of object lock1");
        synchronized (MainDeadlock.lock1) {
            System.out.println("FirstThread catch monitor of object lock1");
            System.out.println("FirstThread want catch the monitor of object lock2");
            synchronized (MainDeadlock.lock2){
                System.out.println("FirstThread catch monitor of objects lock1 and lock2");
            }
        }
    }
}