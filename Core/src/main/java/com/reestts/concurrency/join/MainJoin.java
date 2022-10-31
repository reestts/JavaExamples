package com.reestts.concurrency.join;

public class MainJoin {

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread1 = new TestThread();
        TestThread testThread2 = new TestThread();

        testThread1.start();
        testThread2.start();

        testThread1.join();
        testThread2.join();

        System.out.println("End of program");
    }
}
