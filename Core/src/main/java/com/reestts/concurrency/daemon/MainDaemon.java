package com.reestts.concurrency.daemon;

public class MainDaemon {

    public static void main(String[] args) {
        System.out.println("Main thread starts");

        TestThread testThread = new TestThread();
        testThread.setName("my thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon thread");

        daemonThread.setDaemon(true);
        daemonThread.start();
        testThread.start();

        System.out.println("Main thread ends");
    }
}
