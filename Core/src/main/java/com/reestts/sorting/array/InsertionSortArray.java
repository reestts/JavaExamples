package com.reestts.sorting.array;

import static com.reestts.utils.CustomArrayUtils.outputArray;

public class InsertionSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array, "Source array: ");
        insertionSort(array);
        System.out.println();
        outputArray(array, "Sorted array: ");
    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = current;
        }
    }
}
