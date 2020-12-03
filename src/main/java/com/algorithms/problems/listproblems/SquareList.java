package com.algorithms.problems.listproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SquareList {

    /**
     * Double the elements in the list using functional approach
     *
     * @param numbersList
     * @return
     */
    public static List<Integer> squareListFuncApproach(List<Integer> numbersList) {
        return numbersList.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    /**
     * Double the elements in the list using imperative approach
     *
     * @param numbersList
     * @return
     */
    public static List<Integer> squareListImperApproach(List<Integer> numbersList) {
        List<Integer> doubleList = new ArrayList<>();

        for (int i : numbersList) {
            doubleList.add(i * i);
        }

        return doubleList;
    }

}
