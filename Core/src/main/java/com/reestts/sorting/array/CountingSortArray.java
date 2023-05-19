package com.reestts.sorting.array;

import java.util.Arrays;

import static com.reestts.utils.CustomArrayUtils.outputArray;

public class CountingSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        int[] tempArray = new int[max];
        for (int i = 0; i < max; i++) {
            tempArray[i] = 0;
        }
        for (Integer i : array) {
            int index = i - min;
            tempArray[index] = i;
        }
        int[] sortedArray = Arrays.stream(tempArray)
                .filter(value -> value != 0)
                .toArray();

        System.out.println();
        outputArray(sortedArray);
    }
}
