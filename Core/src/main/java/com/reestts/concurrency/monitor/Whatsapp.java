package com.reestts.concurrency.monitor;

public class Whatsapp implements Runnable {

    @Override
    public void run() {
        new Calls().whatsappCall();
    }
}
