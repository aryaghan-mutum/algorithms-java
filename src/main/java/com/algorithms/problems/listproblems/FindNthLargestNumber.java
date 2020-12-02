package com.algorithms.problems.listproblems;

import java.util.Arrays;
import java.util.Collections;

public class FindNthLargestNumber {

    public static int getNthLargestNumberFuncApproach(int[] arr, int index) {
        return Arrays.stream(arr).sorted().toArray()[index];
    }

    /**
     * FIX ME
     */
    @Deprecated
    public static int getNthLargestNumberImperApproach(int[] arr, int index) {
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - index];
    }

}
