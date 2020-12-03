package com.algorithms.problems.listproblems;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Anurag Muthyam
 */

public class ReverseList {

    /**
     * Reverse a list using functional approach
     *
     * @param list
     * @return
     */
    public static List<Integer> sortAndReverseListFuncApproach(List<Integer> list) {
        return list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    /**
     * Reverse a list using Collections sort and reverse methods
     *
     * @param list
     * @return
     */
    public static void sortAndReverseListFuncApproach2(List<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }

    /**
     * Reverse a list using Collections sort and reverse methods
     *
     * @param list
     * @return
     */
    public static void sortAndReverseListFuncApproach3(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    public static void sortAndReverseListFuncApproach4(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
    }

}
