package com.reestts.solid.lsp;

public class DogWrong implements AnimalWrong {

    // A dog can swim
    @Override
    public void swim() {
        // Swim
    }

    // But a dog cannot fly
    @Override
    public void fly() {
        throw new IllegalStateException();
    }
}
