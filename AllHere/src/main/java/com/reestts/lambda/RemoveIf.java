package com.reestts.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // without predicate
        list.removeIf(element -> element % 2 == 0);

        // with predicate
        //Predicate<Integer> predicate = element -> element % 2 == 0;
        //list.removeIf(predicate);
    }
}