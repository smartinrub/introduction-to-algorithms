package com.sergiomartinrubio.chapter8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{2, 5, 3, 0, 2, 3, 0, 3};
        CountingSort countingSort = new CountingSort();
        int[] output = countingSort.sort(A);
        System.out.println(Arrays.toString(output));
    }
}

