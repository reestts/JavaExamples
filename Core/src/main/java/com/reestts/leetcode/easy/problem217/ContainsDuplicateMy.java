package com.reestts.leetcode.easy.problem217;

import java.util.Arrays;

public class ContainsDuplicateMy {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));                    // true
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));                    // false
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));  // true
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int[] uniqueArray = Arrays.stream(nums).distinct().toArray();

        return nums.length != uniqueArray.length;
    }
}
