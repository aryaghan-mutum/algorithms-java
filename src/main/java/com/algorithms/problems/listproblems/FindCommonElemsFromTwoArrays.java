package com.algorithms.problems.listproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElemsFromTwoArrays {

    /**
     * Find Common Elements from two lists using distinct()
     *
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> findCommonElementsFuncApproach(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    public static List<Integer> findCommonElementsImperApproach(List<Integer> list1, List<Integer> list2) {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for (int i : list1) listX.add(i);
        for (int i : list2) listY.add(i);

        listX.retainAll(listY);
        return listX;
    }

    public static void findCommonElementsImperApproach2(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }

    }

}
