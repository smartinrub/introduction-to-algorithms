package com.sergiomartinrubio.chapter8;

/**
 * Running time: O(max + n) -> O(n)
 * This is an stable sorting algorithm: numbers with the same
 * value appear in the output array in the same order as they
 * do in the input array. This is important if it is used as
 * a subroutine of another algorithm like radix sort.
 */
public class CountingSort {

    public int[] sort(int[] A) {
        int max = findMax(A);
        int[] aux = new int[max + 1];
        // O(n)
        for (int i = 0; i < A.length; i++) {
            aux[A[i]]++;
        }

        // O(max)
        for (int i = 1; i <= max; i++) {
            aux[i] = aux[i] + aux[i - 1];
        }

        int[] output = new int[A.length];
        // O(m)
        for (int i = A.length - 1; i >= 0; i--) {
            output[aux[A[i]] - 1] = A[i];
            aux[A[i]] = aux[A[i]] - 1;
        }
        return output;
    }

    private int findMax(int[] A) {
        int max = A[0];
        // O(n)
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
