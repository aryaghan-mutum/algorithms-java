package com.algorithms.numerical_computation.arrays;

import java.util.Arrays;
import java.util.concurrent.*;
public class FindNthLargestNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 2, 3, 11, 15, 14};
        System.out.println(get4thLargestNumberFunctional(arr));
        System.out.println(get4thLargestNumberImper(arr));
    }

    private static int get4thLargestNumberFunctional(int[] arr) {
        return Arrays.stream(arr).sorted().toArray()[3];
    }

    public static int get4thLargestNumberImper(int[] arr){
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
        return arr[arr.length - 4];
    }

}
