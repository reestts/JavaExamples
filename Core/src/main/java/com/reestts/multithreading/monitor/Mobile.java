package com.reestts.multithreading.monitor;

public class Mobile implements Runnable {
    @Override
    public void run() {
        new Calls().mobileCall();
    }
}