package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(2.0);
        list.add(1.0);
        list.add(0.5);

        double result = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element)
                .get();

        System.out.println(result);
    }
}
