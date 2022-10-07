package com.reestts.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParallelStream {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(5.0);
        list.add(2.0);
        list.add(1.0);
        list.add(0.5);

        Optional<Double> result = list.parallelStream()
                .reduce(Double::sum);

        result.ifPresent(System.out::println);
    }
}
