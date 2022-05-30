package com.reestts.designpatterns.behavioral.state;

public class Reading implements Activity {

    @Override
    public void doIt() {
        System.out.println("Read books...");
    }
}
