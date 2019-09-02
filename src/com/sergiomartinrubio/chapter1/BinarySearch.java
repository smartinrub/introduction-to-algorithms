package com.sergiomartinrubio.chapter1;

/**
 * Runs in O(log(n))
 */
public class BinarySearch {

    public int search(int[] elements, int value) {
        return run(elements, value, 0, elements.length - 1);
    }

    private int run(int[] elements, int value, int limInf, int limSup) {
        int mid = (limInf + limSup) / 2;

        if (limInf > limSup) {
            return -1;
        }

        if (elements[mid] == value) {
            return mid;
        } else if (value < elements[mid]) {
            return run(elements, value, limInf, mid);
        } else {
            return run(elements, value, mid + 1, limSup);
        }
    }
}
