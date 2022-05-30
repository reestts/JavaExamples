package com.reestts.designpatterns.behavioral.strategy;

public class Sleeping implements Activity {

    @Override
    public void doIt() {
        System.out.println("Sleep...");
    }
}
