package com.reestts.leetcode.easy.problem9;

public class PalindromeNumberNotMy {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // false
        System.out.println(isPalindrome(-10));   // false
    }

    static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while (x > 0) {
            rev = x % 10 + rev * 10;
            x = x / 10;
        }
        return rev == original;
    }
}
