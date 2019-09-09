package com.sergiomartinrubio.chapter6;

public class Heapsort {

    public void sort(int[] A) {
        buildMaxHeap(A);
        for (int i = A.length - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            maxHeap(A, i,0);
        }
    }

    private void buildMaxHeap(int[] A) {
        int n = A.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeap(A, n, i);
        }
    }

    private void maxHeap(int[] A, int n, int i) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;
        if (l < n && A[l] > A[i]) {
            largest = l;
        }
        if (r < n && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeap(A, n, largest);
        }
    }
}
