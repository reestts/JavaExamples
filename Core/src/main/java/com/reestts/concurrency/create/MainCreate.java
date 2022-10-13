package com.reestts.concurrency.create;

public class MainCreate {
    public static void main(String[] args) {
        ThreadFromClass threadFromClass = new ThreadFromClass();
        threadFromClass.start();

        Thread threadFromInterface = new Thread(new ThreadFromInterface());
        threadFromInterface.start();
    }
}
