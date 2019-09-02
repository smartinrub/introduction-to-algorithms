package com.sergiomartinrubio.chapter2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        FindMaxSubarray findMaxSubarray = new FindMaxSubarray();
        int[] result = findMaxSubarray.findBruteForce(numbers);
        System.out.println("The maximum sum is: " + Arrays.stream(result).sum());
        System.out.println("The maximum subarray is: " + Arrays.toString(result));

        int[]  result2 = findMaxSubarray.findRecursive(numbers);
        System.out.println("The maximum sum is: " + Arrays.stream(result2).sum());
        System.out.println("The maximum subarray is: " + Arrays.toString(result2));
    }
}
