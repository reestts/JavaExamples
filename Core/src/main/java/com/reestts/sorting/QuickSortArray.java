package com.reestts.sorting;

import static com.reestts.utils.ArrayUtils.outputArray;
import static com.reestts.utils.ArrayUtils.swapElements;

public class QuickSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        int[] sortedArray = sort(array, 0, array.length);

        System.out.println();
        outputArray(sortedArray);
    }

    static int[] sort(int[] array, int index, int size) {
        if (index == size) {
            return array;
        }
        int pivot = partition(array, index, size);
        sort(array, index, pivot);
        sort(array, pivot + 1, size);
        return array;
    }

    static int partition(int[] array, int i, int size) {
        int pivot = i;
        int index = i;
        for (int k = i + 1; k < size; k++) {
            if (array[k] < array[pivot]) {
                index++;
                swapElements(array, index, k);
            }
        }
        swapElements(array, pivot, index);
        pivot = index;
        return pivot;
    }
}
