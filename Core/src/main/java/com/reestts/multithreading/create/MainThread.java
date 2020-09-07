package com.reestts.multithreading.create;

public class MainThread {
    public static void main(String[] args) {
        ThreadFromClass threadFromClass = new ThreadFromClass();
        threadFromClass.start();

        Thread thread = new Thread(new ThreadFromInterface());
        thread.start();
    }
}