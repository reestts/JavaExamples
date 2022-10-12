package com.reestts.solid.lsp;

public class HawkWrong implements AnimalWrong {

    // A hawk cannot swim
    @Override
    public void swim() {
        throw new IllegalStateException();
    }

    // But a hawk can fly
    @Override
    public void fly() {
        // Fly
    }
}
