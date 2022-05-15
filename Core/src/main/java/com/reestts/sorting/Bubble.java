package com.reestts.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bubble {
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

        System.out.println(list);
    }
}
