package com.reestts.casting;

public class MainCasting {
    public static void main(String[] args) {
        Animal animal = new Cat();   // upcasting
        Cat cat = (Cat) animal;  // downcasting
        // animal and cat keep references to the same object
    }
}