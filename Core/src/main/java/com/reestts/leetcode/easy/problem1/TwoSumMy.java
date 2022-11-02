package com.reestts.leetcode.easy.problem1;

import java.util.Arrays;

public class TwoSumMy {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));  // [0,1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));       // [1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));          // [0,1]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 4, 11, 3}, 6)));   // [0,1]
    }

    static int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    firstIndex = i;
                    secondIndex = j;
                    break;
                }
            }
        }
        return new int[]{firstIndex, secondIndex};
    }
}
