package com.algorithms.problems.listproblems.zerosandones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anurag Muthyam
 * Given an array of 1s and 0s which has all 1s first followed by all 0s.
 * Count the number of zeroes and 1’s
 */
public class CountZerosAndOnes {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1, 1, 1, 1, 0, 0, 0, 0, 0);
        countZerosAndOnesUsingListFunctionalApproach(numbersList);
        countZerosAndOnesUsingListImperativeApproach(numbersList);

        int[] numbersArray = new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0};
        countZerosAndOnesUsingArrayFunctionalApproach(numbersArray);
        countZerosAndOnesUsingArrayImperativeApproach(numbersArray);
    }

    /**
     * Functional Approach:
     * Print total count of 1s and 0s using List data structure
     */
    public static void countZerosAndOnesUsingListFunctionalApproach(List<Integer> numbers) {
        long oneCount = numbers.stream().filter(n -> n == 1).count();
        long zeroCount = numbers.stream().filter(n -> n == 0).count();
        System.out.println("Functional Approach using List Total 1's: " + oneCount);
        System.out.println("Functional Approach using List Total 0's: " + zeroCount);
    }

    /**
     * Imperative Approach:
     * Print total count of 1s and 0s using List data structure
     */
    public static void countZerosAndOnesUsingListImperativeApproach(List<Integer> numbers) {

        List<Integer> oneCount = new ArrayList<>();
        List<Integer> zeroCount = new ArrayList<>();

        for (int n : numbers) {
            if (n == 1) {
                oneCount.add(n);
            }
        }

        for (int n : numbers) {
            if (n == 0) {
                zeroCount.add(n);
            }
        }

        System.out.println("Imperative Approach using List Total 1's: " + oneCount.size());
        System.out.println("Imperative Approach using List Total 0's: " + zeroCount.size());
    }

    /**
     * Functional Approach:
     * Print total count of 1s and 0s using an Array data structure
     */
    public static void countZerosAndOnesUsingArrayFunctionalApproach(int[] numbers) {
        long oneCount = Arrays.stream(numbers).filter(n -> n == 1).count();
        long zeroCount = Arrays.stream(numbers).filter(n -> n == 0).count();
        System.out.println("Functional Approach using Array Total 1's using Array" + oneCount);
        System.out.println("Functional Approach using Array Total 0's using Array" + zeroCount);
    }

    /**
     * Imperative Approach:
     * Print total count of 1s and 0s using an Array data structure
     */
    public static void countZerosAndOnesUsingArrayImperativeApproach(int[] numbers) {

        int oneCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                oneCount++;
            } else {
                if (numbers[i] == 0) {
                    zeroCount++;
                }
            }
        }

        System.out.println("Imperative Approach using Array Total 1's: using Array" + oneCount);
        System.out.println("Imperative Approach using Array Total 0's: using Array" + zeroCount);
    }
}
