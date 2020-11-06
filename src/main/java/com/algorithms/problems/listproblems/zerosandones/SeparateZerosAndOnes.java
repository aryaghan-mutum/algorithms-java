package com.algorithms.problems.listproblems.zerosandones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Anurag Muthyam
 * Seperate 0s and 1s in an Array and a List
 * Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
 * Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
public class SeparateZerosAndOnes {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(0, 1, 0, 1, 0, 0, 1, 1, 1, 0);
        System.out.println(separateZerosAndOnesUsingListFunctionalApproach(numbersList));

        int[] numbersArray = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(separateZerosAndOnesUsingArrayFunctionalApproach(numbersArray));
        System.out.println(separateZerosAndOnesUsingArrayImperativeApproach(numbersArray));
    }

    /**
     * Functional Approach:
     * Segregate List of 0s on left side and 1s on right side using List data structure
     */
    public static List<Integer> separateZerosAndOnesUsingListFunctionalApproach(List<Integer> numbers) {
        return numbers.stream()
                .sorted() // reverse order: Comparator.reverseOrder()
                .collect(Collectors.toList());
    }

    /**
     * Functional Approach:
     * Segregate Array of 0s on left side and 1s on right side using List data structure
     */
    public static int[] separateZerosAndOnesUsingArrayFunctionalApproach(int[] numbers) {
        int[] result = Arrays.stream(numbers)
                .sorted()
                .toArray();
        return result;
    }

    public static int[] separateZerosAndOnesUsingArrayImperativeApproach(int[] numbers) {

        int oneCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                oneCount++;
            } else if (numbers[i] == 0) {
                zeroCount++;
            }
        }

        int[] result = new int[]{};

     //   IntStream.range(0, oneCount).forEach(i -> result[i] = 1);

        for (int i = 0; i <= oneCount; i++) {
            result[i] = 1;
        }

        for (int j = 0; j <= zeroCount; j++) {
            result[j] = 0;
        }
      //  IntStream.range(0, zeroCount).forEach(j -> result[j] = 0);
        return result;
    }


}
