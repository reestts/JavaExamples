package com.reestts.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSortList {

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

        List<Integer> sortedList = quickSort(list, 0, list.size());

        log.info("Sorted list: {}", sortedList);
    }

    static List<Integer> quickSort(List<Integer> list, int index, int size) {
        if (index == size) {
            return list;
        }
        int pivot = partition(list, index, size);
        quickSort(list, index, pivot);
        quickSort(list, pivot + 1, size);
        return list;
    }

    static int partition(List<Integer> list, int i, int size) {
        int pivot = i;
        int index = i;
        for (int k = i + 1; k < size; k++) {
            if (list.get(k) < list.get(pivot)) {
                index++;
                Collections.swap(list, index, k);
            }
        }
        Collections.swap(list, pivot, index);
        pivot = index;
        return pivot;
    }
}
