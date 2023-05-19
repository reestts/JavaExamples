package com.reestts.sorting.array;

import static com.reestts.utils.CustomArrayUtils.outputArray;
import static com.reestts.utils.CustomArrayUtils.swapElements;

public class BubbleSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                    System.out.println();
                    outputArray(array);
                }
            }
        }
    }
}
