package com.algorithms.problems.numericalproblems;

import java.util.List;

import static java.util.Arrays.asList;

public class DoubleTheList {
    
    public static void main(String[] args) {
        List<Integer> numbersList = asList(1, 2, 3, 4, 5);
        doubleListFunctionalApproach(numbersList);
    }
    
    private static void doubleListFunctionalApproach(List<Integer> numbersList) {
        numbersList.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.print(" " + n));
    }
    
}
