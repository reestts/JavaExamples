package com.reestts.designpatterns.structural.facade;

import lombok.Data;

@Data
public class BugTracker {

    private boolean isSpringActive;

    void startSpring() {
        System.out.println("Spring is started");
        isSpringActive = true;
    }

    void finishSprint() {
        System.out.println("Spring is finished");
        isSpringActive = false;
    }
}
