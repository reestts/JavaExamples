package com.reestts.sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge {
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
        List<Integer> sortedList = mergeSort(list);
        System.out.println(sortedList);
    }

    static List<Integer> mergeSort(List<Integer> sourceList) {
        if (sourceList.size() <= 1) {
            return sourceList;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n = sourceList.size() / 2;
        for (int i = 0; i < n; i++) {
            list1.add(sourceList.get(i));
        }
        for (int i = n; i < sourceList.size(); i++) {
            list2.add(sourceList.get(i));
        }

        list1 = mergeSort(list1);
        list2 = mergeSort(list2);

        return merge(list1, list2);
    }

    static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) <= list2.get(index2)) {
                merged.add(list1.get(index1++));
            } else {
                merged.add(list2.get(index2++));
            }
        }
        while (index1 < list1.size()) {
            merged.add(list1.get(index1++));
        }
        while (index2 < list2.size()) {
            merged.add(list2.get(index2++));
        }
        return merged;
    }
}
