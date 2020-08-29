package com.reestts.streamapi;

import java.util.Arrays;

public class MainChaining {
    public static void main(String[] args) {
        int[] array = {1, 22, 5, 71, 8, 5, 4, 3, 65, 72, 8, 45, 4,};

        int result = Arrays.stream(array)
                .filter(element -> element % 2 == 1)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce((accumulator, element) -> accumulator + element).getAsInt();

        System.out.println(result);
    }
}