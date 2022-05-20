package com.reestts.math;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 5, 7, 9, 12, 15, 19, 23};

        System.out.println(binSearch(array, 7));
        System.out.println(binSearch(array, 8));
        System.out.println(binSearch(array, 15));
    }

    static boolean binSearch(int[] array, int x) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (array[m] == x) {
                return true;
            }
            if (array[m] < x) {
                l = m + 1;
                continue;
            }
            if (array[m] > x) {
                r = m - 1;
            }
        }
        return false;
    }
}
