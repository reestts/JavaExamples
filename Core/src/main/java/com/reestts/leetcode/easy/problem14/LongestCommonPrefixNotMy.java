package com.reestts.leetcode.easy.problem14;

public class LongestCommonPrefixNotMy {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  // fl
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     //
    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
