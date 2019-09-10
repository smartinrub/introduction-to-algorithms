package com.sergiomartinrubio.chapter7;

// When unbalanced partitioning (subproblem with n - 1 and 0 elements) -> O(n^2)
// Best-case partiotining (each subproblem has size n/2) -> O(n log(n))
// Similar to best-case ~ O(n log(n))
public class QuickSort {

    public void sort(int[] A) {
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int limInf, int limSup) {
        if (limInf < limSup) {
            int mid = partition(A, limInf, limSup);
            quickSort(A, limInf, mid - 1);
            quickSort(A, mid + 1, limSup);
        }
    }

    private int partition(int[] A, int limInf, int limSup) {
        int pivot = A[limSup];
        int indexSmallPartition = limInf - 1;
        for (int j = limInf; j <= limSup - 1; j++) {
            if (A[j] <= pivot) { // replace with >= for decreasing order
                indexSmallPartition++;
                int temp = A[indexSmallPartition];
                A[indexSmallPartition] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[indexSmallPartition + 1];
        A[indexSmallPartition + 1] = A[limSup];
        A[limSup] = temp;
        return indexSmallPartition + 1;
    }
}
