package com.reestts.sorting;

import static com.reestts.utils.ArrayUtils.outputArray;

public class InsertionSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = current;
        }

        System.out.println();
        outputArray(array);
    }
}
