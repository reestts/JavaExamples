package com.reestts.algorithm;

public class Euler {

    public static void main(String[] args) {
        System.out.println(euler(9) == 6);
        System.out.println(euler(36) == 12);
        System.out.println(euler(84) == 24);

        System.out.println();

        System.out.println(eulerFast(9) == 6);
        System.out.println(eulerFast(36) == 12);
        System.out.println(eulerFast(84) == 24);
    }

    /**
     * O(n * log(n))
     */
    static int euler(int n) {
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            if (gcd(i, n) == 1) {
                count++;
            }
        }
        return count;
    }

    /**
     * O(sqrt(n))
     */
    static int eulerFast(int n) {
        int result = n;
        int prime = 2;
        while (n >= prime * prime) {
            if (n % prime == 0) {
                result = result / prime * (prime - 1);
                while (n % prime == 0) {
                    n /= prime;
                }
            }
            ++prime;
        }
        if (n != 1) {
            result = result / n * (n - 1);
        }
        return result;
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
