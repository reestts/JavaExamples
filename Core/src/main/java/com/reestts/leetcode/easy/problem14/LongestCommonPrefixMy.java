package com.reestts.leetcode.easy.problem14;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefixMy {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  // fl
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     //
    }

    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder prefixToCheck = new StringBuilder(strs[0]);
        int iterations = prefixToCheck.length();

        for (int i = 0; i < iterations; i++) {
            boolean result = checkArray(strs, prefixToCheck.toString());
            if (result) {
                return prefixToCheck.toString();
            } else {
                prefixToCheck.deleteCharAt(prefixToCheck.length() - 1);
            }
        }
        return "";
    }

    static boolean checkArray(String[] strs, String prefixToCheck) {
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefixToCheck)) {
                return false;
            }
        }
        return true;
    }
}
