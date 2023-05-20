package com.reestts.sorting.list;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class InsertionSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);
        insertionSort(list);
        log.info("Sorted list: {}", list);
    }

    static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                --j;
            }
            list.set(j + 1, current);
        }
    }
}
