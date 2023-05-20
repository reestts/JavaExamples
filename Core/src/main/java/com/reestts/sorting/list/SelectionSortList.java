package com.reestts.sorting.list;

import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class SelectionSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);
        selectionSort(list);
        log.info("Sorted list: {}", list);
    }

    static void selectionSort(List<Integer> list) {
        for (int j = 0; j < list.size(); j++) {
            int mixIndex = j;
            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(mixIndex) > list.get(i)) {
                    mixIndex = i;
                }
            }
            Collections.swap(list, j, mixIndex);
        }
    }
}
