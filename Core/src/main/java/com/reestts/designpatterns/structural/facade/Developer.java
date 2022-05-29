package com.reestts.designpatterns.structural.facade;

public class Developer {

    void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isSpringActive()) {
            System.out.println("Developer start job...");
        } else {
            System.out.println("Developer is standby");
        }
    }
}
