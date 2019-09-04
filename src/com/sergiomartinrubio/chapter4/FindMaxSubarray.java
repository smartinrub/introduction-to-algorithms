package com.sergiomartinrubio.chapter4;

import java.util.Arrays;

public class FindMaxSubarray {


    /**
     * Runs in O(n^2)
     *
     * @param numbers of integers
     * @return max sum subarray
     */
    public int[] findBruteForce(int[] numbers) {
        int max = numbers[0];
        int leftIndex = 0;
        int rightIndex = 0;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            sum = 0;
            for (int j = i; j < numbers.length; j++) {
                sum = sum + numbers[j];
                if (sum > max) {
                    max = sum;
                    leftIndex = i;
                    rightIndex = j;
                }
            }
        }
        return Arrays.copyOfRange(numbers, leftIndex, rightIndex + 1);
    }

    /**
     * Runs in
     *
     * @param numbers of integers
     * @return max sum subarray
     */
    public int[] findRecursive(int[] numbers) {
        SubArray result = maxSubarray(numbers, 0, numbers.length - 1);
        return Arrays.copyOfRange(numbers, result.getLow(), result.getHigh() + 1);
    }

    private SubArray maxSubarray(int[] subArray, int low, int high) {
        if (high == low) {
            return new SubArray(low, high, subArray[low]);
        } else {
            int mid = (low + high) / 2;
            SubArray leftSubArray = maxSubarray(subArray, low, mid);
            SubArray rightSubArray = maxSubarray(subArray, mid + 1, high);
            SubArray crossingSubArray = maxCrossingSubArray(subArray, low, mid, high);
            if (leftSubArray.getSum() >= rightSubArray.getSum() && leftSubArray.getSum() >= crossingSubArray.getSum()) {
                return leftSubArray;
            } else if (rightSubArray.getSum() >= leftSubArray.getSum() && rightSubArray.getSum() >= crossingSubArray.getSum()) {
                return rightSubArray;
            } else {
                return crossingSubArray;
            }
        }
    }

    private SubArray maxCrossingSubArray(int[] subArray, int low, int mid, int high) {
        int leftSum = subArray[0];
        int rightSum = subArray[0];
        int maxLeft = 0;
        int maxRight = 0;
        int sum = 0;
        for (int i = mid; i > low; i--) {
            sum = sum + subArray[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }

        sum = 0;
        for (int j = mid; j < high; j++) {
            sum = sum + subArray[j];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new SubArray(maxLeft, maxRight, leftSum + rightSum);
    }
}

class SubArray {
    private final int low, high, sum;

    SubArray(int low, int high, int sum) {
        this.low = low;
        this.high = high;
        this.sum = sum;
    }

    int getLow() {
        return low;
    }

    int getHigh() {
        return high;
    }

    int getSum() {
        return sum;
    }
}
