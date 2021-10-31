package com.reestts.reflection;

public class MyClass {

    public int number;
    public String type;
    private String secret;

    public void updateType() {
        type = type + type;
    }

    public MyClass() {
    }

    public MyClass(int number, String type, String secret) {
        this.number = number;
        this.type = type;
        this.secret = secret;
    }
}
