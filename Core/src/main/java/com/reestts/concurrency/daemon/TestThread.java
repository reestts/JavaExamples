package com.reestts.concurrency.daemon;

public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char c = 'A'; c <= 'J'; c++) {
            try {
                sleep(300);
                System.out.println(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
