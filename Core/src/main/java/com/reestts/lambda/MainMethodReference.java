package com.reestts.lambda;

import java.util.Arrays;

public class MainMethodReference {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Arrays.stream(array).forEach(Utils::addFive);
    }
}
