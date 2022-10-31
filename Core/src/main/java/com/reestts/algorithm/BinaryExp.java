package com.reestts.algorithm;

public class BinaryExp {

    public static void main(String[] args) {
        System.out.println(binExp(2, 10) == 1024);
        System.out.println(binExp(3, 5) == 243);
        System.out.println(binExp(3, 15) == 14348907);
    }

    static long binExp(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 1) {
            return binExp(a, n - 1) * a;
        }
        long b = binExp(a, n / 2);
        return b * b;
    }
}
