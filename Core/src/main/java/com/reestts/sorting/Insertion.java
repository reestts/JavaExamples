package com.reestts.sorting;

import java.util.ArrayList;
import java.util.List;

public class Insertion {
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

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                --j;
            }
            list.set(j + 1, current);
        }

        System.out.println(list);
    }
}
