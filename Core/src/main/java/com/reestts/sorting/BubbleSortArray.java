package com.reestts.sorting;

import static com.reestts.utils.ArrayUtils.outputArray;
import static com.reestts.utils.ArrayUtils.swapElements;

public class BubbleSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        for (int j = 0; j < array.length; j++) {
            boolean isSorted = true;
            for (int i = 1; i < array.length - j; i++) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;
                    swapElements(array, i, i - 1);
                }
            }
            if (isSorted) {
                break;
            }
        }

        System.out.println();
        outputArray(array);
    }
}
