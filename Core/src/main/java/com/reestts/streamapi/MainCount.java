package com.reestts.streamapi;

import java.util.stream.Stream;

public class MainCount {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream.count());
    }
}
