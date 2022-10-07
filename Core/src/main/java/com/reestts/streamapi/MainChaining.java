package com.reestts.streamapi;

import java.util.Arrays;
import java.util.OptionalInt;

public class MainChaining {

    public static void main(String[] args) {
        int[] array = {1, 22, 5, 71, 8, 5, 4, 3, 65, 72, 8, 45, 4,};

        OptionalInt result = Arrays.stream(array)
                .filter(element -> element % 2 == 1)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce(Integer::sum);

        result.ifPresent(System.out::println);
    }
}
