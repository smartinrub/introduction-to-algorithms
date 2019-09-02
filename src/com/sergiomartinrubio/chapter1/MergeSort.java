package com.sergiomartinrubio.chapter1;

/**
 * Runs in O(n log(n))
 */
public class MergeSort {

    public void sort(int[] elements) {
        if (elements.length > 1) {
            int[] left = new int[elements.length / 2];
            int[] right = new int[elements.length - left.length];
            System.arraycopy(elements, 0, left, 0, left.length);
            System.arraycopy(elements, left.length, right, 0, right.length);

            sort(left);
            sort(right);
            merge(elements, left, right);
        }
    }

    private void merge(int[] result, int[] left, int[] right) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                result[indexResult] = left[indexLeft];
                indexLeft++;
            } else {
                result[indexResult] = right[indexRight];
                indexRight++;
            }
            indexResult++;
        }

        System.arraycopy(left, indexLeft, result, indexResult, left.length - indexLeft);
        System.arraycopy(right, indexRight, result, indexResult, right.length - indexRight);
    }
}
