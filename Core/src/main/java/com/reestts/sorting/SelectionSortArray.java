package com.reestts.sorting;

import static com.reestts.utils.ArrayUtils.outputArray;
import static com.reestts.utils.ArrayUtils.swapElements;

public class SelectionSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        for (int j = 0; j < array.length; j++) {
            int mixIndex = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[mixIndex] > array[i]) {
                    mixIndex = i;
                }
            }
            swapElements(array, j, mixIndex);
        }

        System.out.println();
        outputArray(array);
    }
}
