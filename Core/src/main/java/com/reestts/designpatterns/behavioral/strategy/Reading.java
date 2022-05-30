package com.reestts.designpatterns.behavioral.strategy;

public class Reading implements Activity {

    @Override
    public void doIt() {
        System.out.println("Read books...");
    }
}
