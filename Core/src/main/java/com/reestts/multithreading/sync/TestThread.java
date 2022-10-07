package com.reestts.multithreading.sync;

public class TestThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        Counter.count++;
        System.out.println(Counter.count + " ");
    }
}
