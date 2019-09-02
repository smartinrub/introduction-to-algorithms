package com.sergiomartinrubio.chapter1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 4, 6, 1, 3};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.increasingSort(numbers);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + "-"));
        System.out.println();

        numbers = new int[]{5, 2, 4, 6, 1, 3};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(numbers);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + "-"));
        System.out.println();

        numbers = new int[]{5, 2, 4, 6, 1, 3};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(numbers);
        Arrays.stream(numbers).forEach(number -> System.out.print(number + "-"));
        System.out.println();

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(numbers, 5));

        numbers = new int[]{5, 2, 4, 6, 1, 3};
        TwoElementsSumFinder twoElementsSumFinder = new TwoElementsSumFinder();
        System.out.println(twoElementsSumFinder.hasTwoElementsSum(numbers, 2));

    }
}
