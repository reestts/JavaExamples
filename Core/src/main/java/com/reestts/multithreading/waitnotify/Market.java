package com.reestts.multithreading.waitnotify;

public class Market {
    private int fruitCount = 0;

    public synchronized void getFruit() {
        while (fruitCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        fruitCount--;
        System.out.println("Consumer get 1 fruit");
        System.out.println("Fruit in market = " + fruitCount);
        notify();
    }

    public synchronized void addFruit() {
        while (fruitCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        fruitCount++;
        System.out.println("Producer add 1 fruit");
        System.out.println("Fruit in market = " + fruitCount);
        notify();
    }
}