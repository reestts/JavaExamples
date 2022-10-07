package com.reestts.generics;

public class Info<T> {

    private final T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{" + value + "}";
    }

    public T getValue() {
        return value;
    }
}
