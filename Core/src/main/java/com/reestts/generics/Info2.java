package com.reestts.generics;

public class Info2<T extends Number> {
    private T value;

    public Info2(T value) {
        this.value = value;
    }

    public String toString() {
        return "{" + value + "}";
    }

    public T getValue() {
        return value;
    }
}