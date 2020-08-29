package com.reestts.collections.output;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutputList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // long
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer);
        }

        // short
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}