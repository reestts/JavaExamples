package com.reestts.math;

public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(15, 20));
        System.out.println(gcd(42, 68));
        System.out.println(gcd(16, 36));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
