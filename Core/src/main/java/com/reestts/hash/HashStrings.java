package com.reestts.hash;

public class HashStrings {

    public static void main(String[] args) {
        System.out.println(stringHash("aaa"));
        System.out.println(stringHash("abb"));
        System.out.println(stringHash("abb"));
    }

    static long stringHash(String text) {
        final int p = 31;
        final int m = 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 * 10 + 7;
        long hash = 0;
        long primePow = 1;

        for (char ch : text.toCharArray()) {
            hash = (hash + (ch - 'a' + 1) * primePow) % m;
            primePow = (primePow * p) % m;
        }

        return hash;
    }
}
