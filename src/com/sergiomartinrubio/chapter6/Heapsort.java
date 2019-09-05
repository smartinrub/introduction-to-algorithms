package com.sergiomartinrubio.chapter6;

public class Heapsort {

    public void sort(int[] A) {
        int n = A.length - 1;
        for (int i = 0; i < n / 2; i++) {
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
