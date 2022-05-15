package com.reestts.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quick {
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
        List<Integer> sortedList = sort(list, 0, list.size());
        System.out.println(sortedList);
    }

    static List<Integer> sort(List<Integer> list, int i, int j) {
        if (i == j) {
            return list;
        }
        int pivot = partition(list, i, j);
        sort(list, i, pivot);
        sort(list, pivot + 1, j);
        return list;
    }

    static int partition(List<Integer> list, int i, int j) {
        int pivot = i;
        int index = i;
        for (int k = i + 1; k < j; k++) {
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
