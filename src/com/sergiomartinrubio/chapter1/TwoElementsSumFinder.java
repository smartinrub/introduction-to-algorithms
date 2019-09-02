package com.sergiomartinrubio.chapter1;


public class TwoElementsSumFinder {

    public boolean hasTwoElementsSum(int[] elements, int sum) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(elements);

        int leftIndex = 0;
        int rightIndex = elements.length - 1;
        while (leftIndex < rightIndex) {
            if (elements[leftIndex] + elements[rightIndex] == sum) {
                return true;
            } else if (elements[leftIndex] + elements[rightIndex] < sum) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return false;
    }
}
