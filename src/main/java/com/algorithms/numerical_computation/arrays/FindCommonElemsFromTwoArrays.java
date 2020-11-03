package com.algorithms.numerical_computation.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElemsFromTwoArrays {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 4);

        System.out.println(findCommonElementsUsingDistinct(list1, list2));
        System.out.println(findCommonElementsImperativeApproach(list1, list2));
        findCommonElementsImperativeApproach2();
        System.out.println();
    }

    /**
     * Find Common Elements from two lists using distinct()
     *
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> findCommonElementsUsingDistinct(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    /**
     * @param list1
     * @param list2
     * @return
     */
    public static List<Integer> findCommonElementsImperativeApproach(List<Integer> list1, List<Integer> list2) {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for (int i : list1) {
            listX.add(i);
        }

        for (int i : list2) {
            listY.add(i);
        }

        listX.retainAll(listY);
        return listX;
    }

    public static void findCommonElementsImperativeApproach2() {

        int arr1[] = {1, 2, 5, 7, 89, 3};
        int arr2[] = {1, 45, 87, 34, 3};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }

    }

}
