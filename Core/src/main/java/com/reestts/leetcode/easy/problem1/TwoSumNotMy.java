package com.reestts.leetcode.easy.problem1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumNotMy {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));  // [0,1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));       // [1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));          // [0,1]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 4, 11, 3}, 6)));   // [0,1]
    }

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
