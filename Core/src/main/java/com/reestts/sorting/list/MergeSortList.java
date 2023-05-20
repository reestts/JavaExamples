package com.reestts.sorting.list;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class MergeSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);
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
