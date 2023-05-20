package com.reestts.sorting.array;

import static com.reestts.utils.CustomArrayUtils.outputArray;

public class MergeSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array, "Source array: ");
        mergeSort(array, array.length);
        System.out.println();
        outputArray(array, "Sorted array: ");
    }

    static void mergeSort(int[] sourceArray, int sourceArrayLength) {
        if (sourceArrayLength <= 1) {
            return;
        }
        int half = sourceArrayLength / 2;
        int remainder = sourceArrayLength - half;
        int[] leftArray = new int[half];
        int[] rightArray = new int[remainder];
        for (int i = 0; i < half; i++) {
            leftArray[i] = sourceArray[i];
        }
        for (int i = half; i < sourceArrayLength; i++) {
            rightArray[i - half] = sourceArray[i];
        }

        mergeSort(leftArray, half);
        mergeSort(rightArray, remainder);

        merge(sourceArray, leftArray, rightArray, half, remainder);
    }

    static void merge(int[] sourceArray, int[] leftArray, int[] rightArray, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (leftArray[i] <= rightArray[j]) {
                sourceArray[k++] = leftArray[i++];
            } else {
                sourceArray[k++] = rightArray[j++];
            }
        }
        while (i < leftIndex) {
            sourceArray[k++] = leftArray[i++];
        }
        while (j < rightIndex) {
            sourceArray[k++] = rightArray[j++];
        }
    }
}
