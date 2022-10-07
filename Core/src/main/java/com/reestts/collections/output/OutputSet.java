package com.reestts.collections.output;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OutputSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // long
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.print(integer);
        }

        // short
        for (Integer integer : set) {
            System.out.print(integer);
        }
    }
}
