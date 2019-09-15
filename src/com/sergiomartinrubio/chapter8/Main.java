package com.sergiomartinrubio.chapter8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{2, 5, 3, 0, 2, 3, 0, 3};
        CountingSort countingSort = new CountingSort();
        countingSort.sort(A);
        System.out.println(Arrays.toString(A));

        A = new int[]{329, 457, 657, 839, 436, 720, 355};
        RadixSort radixSort = new RadixSort();
        radixSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}

