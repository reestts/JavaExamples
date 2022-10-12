package com.reestts.solid.isp;

/**
 * Interface Segregation Principle (ISP).
 * A client shouldn’t be forced to implement an interface that it doesn’t use.
 */
public class Duck implements Bird, Swimmer {

    // A duck can fly
    @Override
    public void fly() {
        // Fly
    }

    // A duck can swim
    @Override
    public void swim() {
        // Swim
    }
}
