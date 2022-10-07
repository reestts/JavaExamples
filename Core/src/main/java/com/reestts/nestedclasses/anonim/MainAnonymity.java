package com.reestts.nestedclasses.anonim;

public class MainAnonymity {

    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int getSum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.getSum(3, 4));
    }
}
