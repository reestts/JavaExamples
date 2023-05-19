package com.reestts.sorting.array;

import static com.reestts.utils.CustomArrayUtils.outputArray;
import static com.reestts.utils.CustomArrayUtils.swapElements;

public class SelectionSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        for (int i = 0; i < array.length; i++) {
            int mixIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[mixIndex] > array[j]) {
                    mixIndex = j;
                }
            }
            swapElements(array, i, mixIndex);
            System.out.println();
            outputArray(array);
        }
    }
}
