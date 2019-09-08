package com.sergiomartinrubio.chapter6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        Heapsort heapsort = new Heapsort();
        heapsort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
