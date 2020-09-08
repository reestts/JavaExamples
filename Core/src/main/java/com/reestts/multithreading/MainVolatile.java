package com.reestts.multithreading;

public class MainVolatile extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MainVolatile thread = new MainVolatile();
        thread.start();
        Thread.sleep(3000);
        System.out.println("Wait 3 seconds and WAKE UP!");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}