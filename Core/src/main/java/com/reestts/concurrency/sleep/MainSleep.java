package com.reestts.concurrency.sleep;

public class MainSleep {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Boom!");
    }
}
