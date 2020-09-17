package com.reestts.multithreading.monitor;

public class Calls {
    static final Object callLock = new Object();

    void mobileCall() {
        synchronized (callLock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (callLock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall() {
        synchronized (callLock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }
}