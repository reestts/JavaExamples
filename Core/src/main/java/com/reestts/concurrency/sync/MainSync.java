package com.reestts.concurrency.sync;

public class MainSync {

    public static void main(String[] args) {
        TestThread thread1 = new TestThread();
        TestThread thread2 = new TestThread();
        TestThread thread3 = new TestThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
