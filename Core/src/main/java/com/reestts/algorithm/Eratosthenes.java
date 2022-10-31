package com.reestts.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {

    public static void main(String[] args) {
        System.out.println(eratosthenes(20));
        System.out.println(eratosthenes(50));
        System.out.println(eratosthenes(100));
    }

    static List<Integer> eratosthenes(int n) {
        List<Boolean> mark = new ArrayList<>();
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mark.add(true);
        }
        primes.add(2);

        for (int i = 3; i * i <= n; i += 2) {
            if (Boolean.TRUE.equals(mark.get(i))) {
                primes.add(i);
                for (int j = i * i; j < n; j += i) {
                    mark.set(j, false);
                }
            }
        }

        for (int i = 3; i < n; i += 2) {
            if (Boolean.TRUE.equals(mark.get(i))) {
                primes.add(i);
            }
        }
        return primes;
    }
}
