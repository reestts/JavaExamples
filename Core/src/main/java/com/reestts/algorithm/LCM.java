package com.reestts.algorithm;

public class LCM {

    public static void main(String[] args) {
        System.out.println(lcm(15, 20));
        System.out.println(lcm(42, 68));
        System.out.println(lcm(16, 36));
    }

    static int lcm(int a, int b) {
        return (a * b) / (gcd(a, b));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
