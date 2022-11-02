package com.reestts.leetcode.easy.problem9;

public class PalindromeNumberMy {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // false
        System.out.println(isPalindrome(-10));   // false
    }

    static boolean isPalindrome(int x) {
        boolean result = true;
        char[] array = String.valueOf(x).toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
