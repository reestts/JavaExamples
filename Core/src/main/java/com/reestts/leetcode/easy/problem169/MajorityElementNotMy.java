package com.reestts.leetcode.easy.problem169;

public class MajorityElementNotMy {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));              // 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));  // 2
    }

    static int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;

        for (int element : nums) {
            if (count == 0) {
                max = element;
            }
            if (element == max) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        return max;
    }
}
