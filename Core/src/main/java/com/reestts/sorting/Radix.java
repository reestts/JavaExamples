package com.reestts.sorting;

import java.util.ArrayList;
import java.util.List;

public class Radix {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(4);

        System.out.println(list);
        List<Integer> sortedList = sort(list);
        System.out.println(sortedList);
    }

    static List<Integer> sort(List<Integer> list) {
        List<List<Integer>> lists = new ArrayList<>();
        int powerOfTen = 1;
        for (int pow = 0; pow <= 5; pow++) {
            for (Integer i : list) {
                var element = lists.get(i / powerOfTen % 10);
                element.add(i);
            }
        }
        list.clear();

        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                list.add(null);
            }
        }
        powerOfTen *= 10;
        return list;
    }
}
