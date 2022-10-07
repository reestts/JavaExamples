package com.reestts.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class MainMinMax {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        int min = (stream1.min(Comparator.comparingInt(x -> x))).get();
        System.out.println(min);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        int max = (stream2.max(Comparator.comparingInt(x -> x))).get();
        System.out.println(max);
    }
}
