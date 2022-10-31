package com.reestts.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 5, 7, 9, 12, 15, 19, 23};

//        System.out.println(binSearch(array, 7));
//        System.out.println(binSearch(array, 8));
        System.out.println(binSearch(array, 15));
    }

    static boolean binSearch(int[] array, int searchValue) {
        int tempLength = 0;
        int lastIndex = array.length - 1;

        while (tempLength <= lastIndex) {
            int middleIndex = (tempLength + lastIndex) / 2;
            if (array[middleIndex] == searchValue) {
                return true;
            }
            if (array[middleIndex] < searchValue) {
                tempLength = middleIndex + 1;
                continue;
            }
            if (array[middleIndex] > searchValue) {
                lastIndex = middleIndex - 1;
            }
        }
        return false;
    }
}
