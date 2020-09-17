package com.reestts.multithreading.monitor;

public class Skype implements Runnable {
    @Override
    public void run() {
        new Calls().skypeCall();
    }
}