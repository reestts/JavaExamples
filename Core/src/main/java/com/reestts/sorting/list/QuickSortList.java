package com.reestts.sorting.list;

import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class QuickSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);
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
