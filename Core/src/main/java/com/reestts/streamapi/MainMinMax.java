package com.reestts.streamapi;

import java.util.stream.Stream;

public class MainMinMax {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        int min = (stream1.min((x, y) -> x - y)).get();
        System.out.println(min);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        int max = (stream2.max((x, y) -> x - y)).get();
        System.out.println(max);
    }
}