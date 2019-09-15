package com.sergiomartinrubio.chapter8;

/**
 * Running time: O(d((n + k)). where d is the number of digits, so it can run at linear time.
 * It requires a stable algorithm to sort each digit.
 */
public class RadixSort {

    public void sort(int[] A) {
        int max = findMax(A);

        for (int position = 1; max / position > 0; position *= 10) {
            countingSort(A, position, max);
        }
    }

    private int findMax(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    private void countingSort(int[] A, int position, int max) {
        int[] aux = new int[max + 1];
        int[] output = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            aux[(A[i] / position) % 10]++;
        }

        for (int i = 1; i < max; i++) {
            aux[i] = aux[i] + aux[i - 1];
        }

        for (int i = A.length - 1; i >= 0; i--) {
            output[aux[(A[i] / position) % 10] - 1] = A[i];
            aux[(A[i] / position) % 10]--;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = output[i];
        }
    }

}
