package com.reestts.multithreading.join;

public class MainJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println("End of program");
    }
}