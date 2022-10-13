package com.reestts.concurrency.monitor;

public class Skype implements Runnable {

    @Override
    public void run() {
        new Calls().skypeCall();
    }
}
