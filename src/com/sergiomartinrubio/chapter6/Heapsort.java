package com.sergiomartinrubio.chapter6;

import java.util.Arrays;

public class Heapsort {

    public void sort(int[] A) {
        buildMaxHeap(A);
        for (int i = A.length - 1; i > 1; i--) {
            int temp = A[1];
            A[1] = A[i];
            A[i] = temp;
            A = Arrays.copyOfRange(A, 0, A.length - 1);
            maxHeap(A, 0);
        }
    }

    private void buildMaxHeap(int[] A) {
        for (int i = A.length / 2 - 1; i >= 0; i--) {
            maxHeap(A, i);
        }
    }

    private void maxHeap(int[] A, int i) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;
        if (l < A.length && A[l] > A[i]) {
            largest = l;
        }
        if (r < A.length && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeap(A, largest);
        }
    }
}
