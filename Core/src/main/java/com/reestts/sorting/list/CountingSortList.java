package com.reestts.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class CountingSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[list.size()];

        for (Integer i : list) {
            count[i - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            output[count[list.get(i) - min] - 1] = list.get(i);
            count[list.get(i) - min]--;
        }

        List<Integer> sortedList = new ArrayList<>();
        for (int el : output) {
            sortedList.add(el);
        }

        log.info("Sorted list: {}", sortedList);
    }
}
