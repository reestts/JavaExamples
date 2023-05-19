package com.reestts.sorting.list;

import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class BubbleSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);

        for (int j = 0; j < list.size(); j++) {
            boolean isSorted = true;
            for (int i = 1; i < list.size() - j; i++) {
                if (list.get(i) < list.get(i - 1)) {
                    isSorted = false;
                    Collections.swap(list, i, i - 1);
                }
            }
            if (isSorted) {
                break;
            }
        }

        log.info("Sorted list: {}", list);
    }
}
