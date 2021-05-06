package com.algorithms.problems.listproblems;

import java.util.*;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * <p>
 * Input: arr[] = {0, -1, 2, -3, 1}
 * sum = -2
 * Output: -3, 1
 * If we calculate the sum of the output,
 * 1 + (-3) = -2
 * <p>
 * Input: arr[] = {1, -2, 1, 0, 5}
 * sum = 0
 * Output: -1
 * No valid pair exists.
 */
public class GetPairs {

    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        List<Integer> output = getPairOfNumbers(arr, -2);
        System.out.println(output);

        List<Integer> output2 = hasArrayTwoCandidates(arr, -2);
        System.out.println(output2);

    }

    public static List<Integer> hasArrayTwoCandidates(int arr[], int targetNum) {
        List<Integer> resultList = new ArrayList<>();
        int l, r;

        Arrays.sort(arr);

        l = 0;
        r = arr.length - 1;

        while (l < r) {
            if (arr[l] + arr[r] == targetNum) {
                resultList.add(l);
                resultList.add(r);
            } else if (arr[l] + arr[r] < targetNum) {
                l++;
            } else {
                r--;
            }
        }
        return resultList;
    }

    public static List<Integer> getPairOfNumbers(int[] arr, int targetNum) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {

                int firstElem = arr[i];
                int secondElem = arr[j];
                int sum = firstElem + secondElem;

                if (sum == targetNum) {
                    resultList.add(firstElem);
                    resultList.add(secondElem);
                }
            }
        }
        return resultList;
    }

}
