package com.reestts.streamapi;

import java.util.stream.Stream;

public class MainConcat {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> secondStream = Stream.of(8, 7, 6, 5, 4, 3, 2, 1);
        Stream<Integer> commonStream = Stream.concat(firstStream, secondStream);

        commonStream.forEach(System.out::println);
    }
}