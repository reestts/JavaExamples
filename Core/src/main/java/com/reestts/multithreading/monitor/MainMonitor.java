package com.reestts.multithreading.monitor;

public class MainMonitor {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Mobile());
        Thread thread2 = new Thread(new Skype());
        Thread thread3 = new Thread(new Whatsapp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
