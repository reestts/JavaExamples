package com.reestts.multithreading.daemon;

public class MainDaemon {

    public static void main(String[] args) {
        System.out.println("Main thread starts");

        MyThread myThread = new MyThread();
        myThread.setName("my thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon thread");

        daemonThread.setDaemon(true);
        daemonThread.start();
        myThread.start();

        System.out.println("Main thread ends");
    }
}
