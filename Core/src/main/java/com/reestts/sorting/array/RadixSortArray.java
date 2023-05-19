package com.reestts.sorting.array;

import java.util.Arrays;

import static com.reestts.utils.CustomArrayUtils.outputArray;

public class RadixSortArray {

    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 1, 3, 2, 9, 4};
        outputArray(array);

        radixSort(array, array.length);

        System.out.println();
        outputArray(array);
    }

    static void radixSort(int[] array, int length) {
        int m = getMax(array, length);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(array, length, exp);
        }
    }

    static int getMax(int[] array, int length) {
        int mx = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > mx) {
                mx = array[i];
            }
        }
        return mx;
    }

    static void countSort(int[] array, int length, int exp) {
        int[] output = new int[length];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < length; i++) {
            count[(array[i] / exp) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = length - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        for (i = 0; i < length; i++) {
            System.arraycopy(output, 0, array, 0, length);
        }
    }
}
