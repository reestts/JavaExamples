package com.reestts.multithreading;

public class ThreadFromInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from interface");
    }
}