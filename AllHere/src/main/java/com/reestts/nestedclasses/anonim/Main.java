package com.reestts.nestedclasses.anonim;

public class Main {
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.doOperation(3, 4));
    }
}