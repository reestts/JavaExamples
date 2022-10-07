package com.reestts.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {

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

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < max - min + 1; i++) {
            tempList.add(0);
        }

        for (Integer i : list) {
            int index = i - min;
            tempList.set(index, i);
        }

        list.clear();
        list = tempList.stream()
                .filter(element -> element != 0)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
