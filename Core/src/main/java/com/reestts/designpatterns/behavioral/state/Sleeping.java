package com.reestts.designpatterns.behavioral.state;

public class Sleeping implements Activity {

    @Override
    public void doIt() {
        System.out.println("Sleep...");
    }
}
