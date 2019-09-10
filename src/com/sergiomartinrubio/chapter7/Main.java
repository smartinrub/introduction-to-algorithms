package com.sergiomartinrubio.chapter7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
