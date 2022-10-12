package com.reestts.solid.lsp;

/**
 * Liskov Substitution Principle (LSP).
 * A class can be replaced by its subclass in all practical usage scenarios, meaning that you should use inheritance only for substitutability.
 */
public class Dog implements Animal {

    // A dog can swim
    @Override
    public void swim() {
        // Swim
    }
}
