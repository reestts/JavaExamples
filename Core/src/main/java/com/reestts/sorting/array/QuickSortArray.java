package com.reestts.sorting.array;

import static com.reestts.utils.CustomArrayUtils.outputArray;
import static com.reestts.utils.CustomArrayUtils.swapElements;

public class QuickSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        quickSort(array, 0, array.length);

        System.out.println();
        outputArray(array);
    }

    static void quickSort(int[] array, int index, int size) {
        if (index == size) {
            return;
        }
        int pivot = partition(array, index, size);
        quickSort(array, index, pivot);
        quickSort(array, pivot + 1, size);
    }

    static int partition(int[] array, int i, int size) {
        int pivot = i;
        int index = i;
        for (int k = i + 1; k < size; k++) {
            if (array[k] < array[pivot]) {
                index++;
                swapElements(array, index, k);
            }
            System.out.println();
            outputArray(array);
        }
        swapElements(array, pivot, index);
        pivot = index;
        return pivot;
    }
}
