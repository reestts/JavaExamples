package com.reestts.sorting;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSortList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(4);
        log.info("List: {}", list);

        List<Integer> sortedList = mergeSort(list);

        log.info("Sorted list: {}", sortedList);
    }

    static List<Integer> mergeSort(List<Integer> sourceList) {
        if (sourceList.size() <= 1) {
            return sourceList;
        }
        int half = sourceList.size() / 2;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i = 0; i < half; i++) {
            leftList.add(sourceList.get(i));
        }
        for (int i = half; i < sourceList.size(); i++) {
            rightList.add(sourceList.get(i));
        }

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return merge(leftList, rightList);
    }

    static List<Integer> merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> mergedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            if (leftList.get(leftIndex) <= rightList.get(rightIndex)) {
                mergedList.add(leftList.get(leftIndex++));
            } else {
                mergedList.add(rightList.get(rightIndex++));
            }
        }
        while (leftIndex < leftList.size()) {
            mergedList.add(leftList.get(leftIndex++));
        }
        while (rightIndex < rightList.size()) {
            mergedList.add(rightList.get(rightIndex++));
        }
        return mergedList;
    }
}
