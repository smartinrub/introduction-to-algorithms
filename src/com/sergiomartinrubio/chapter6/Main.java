package com.sergiomartinrubio.chapter6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] A = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
        Heapsort heapsort = new Heapsort();
        heapsort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
