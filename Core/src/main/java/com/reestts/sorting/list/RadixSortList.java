package com.reestts.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

import static com.reestts.utils.CustomArrayUtils.createArrayList;

@Slf4j
public class RadixSortList {

    public static void main(String[] args) {
        List<Integer> list = createArrayList();
        log.info("Source list: {}", list);
        radixSort(list, list.size());
        log.info("Sorted list: {}", list);
    }

    static void radixSort(List<Integer> list, int size) {
        int m = getMax(list, size);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(list, size, exp);
        }
    }

    static int getMax(List<Integer> list, int size) {
        int mx = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) > mx) {
                mx = list.get(i);
            }
        }
        return mx;
    }

    static void countSort(List<Integer> list, int size, int exp) {
        List<Integer> output = new ArrayList<>(Collections.nCopies(size, 0)); // output array
        int i;
        List<Integer> count = new ArrayList<>(Collections.nCopies(10, 0));

        for (i = 0; i < size; i++) {
            count.set((list.get(i) / exp) % 10, count.get((list.get(i) / exp) % 10) + 1);
        }

        for (i = 1; i < 10; i++) {
            count.set(i, count.get(i) + count.get(i - 1));
        }

        for (i = size - 1; i >= 0; i--) {
            output.set(count.get((list.get(i) / exp) % 10) - 1, list.get(i));
            count.set((list.get(i) / exp) % 10, count.get((list.get(i) / exp) % 10) - 1);
        }

        for (i = 0; i < size; i++) {
            list.set(i, output.get(i));
        }
    }
}
