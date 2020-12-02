package com.algorithms.problems.listproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

    public static List<Integer> sortAndReverseListFuncApproach(List<Integer> list) {
        return list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void sortAndReverseListFuncApproach2(List<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
    }

    public static void sortAndReverseListFuncApproach3(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    public static void sortAndReverseListFuncApproach4(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
    }

}
