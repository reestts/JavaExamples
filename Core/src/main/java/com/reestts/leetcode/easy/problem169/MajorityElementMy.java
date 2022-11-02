package com.reestts.leetcode.easy.problem169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementMy {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));              // 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));  // 2
    }

    static int majorityElement(int[] nums) {
        int minCount = nums.length / 2;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                Integer integer = map.get(num);
                integer++;
                map.put(num, integer);
            }
        }
        for (final Map.Entry<Integer, Integer> pair : map.entrySet()) {
            Integer key = pair.getKey();
            Integer value = pair.getValue();
            if (value > minCount) {
                result = key;
                break;
            }
        }
        return result;
    }
}
