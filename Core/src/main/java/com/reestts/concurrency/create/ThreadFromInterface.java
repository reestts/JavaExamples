package com.reestts.concurrency.create;

public class ThreadFromInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from interface");
    }
}
