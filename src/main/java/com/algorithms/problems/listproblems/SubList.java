package com.algorithms.problems.listproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SubList {

    public static List<Integer> getSubListFuncApproach2(List<Integer> list, int start, int end) {
        return list.stream()
                .collect(toList())
                .subList(start, end + 1);
    }

    public static int[] getSubListFuncApproach(List<Integer> list, int start, int end) {
        return IntStream.range(start, end)
                .map(e -> list.get(e))
                .toArray();
    }

    public static List<Integer> getSubListImperApproach(List<Integer> list, int start, int end) {
        List<Integer> subList = new ArrayList<>();

        for (int i = start; i < end; i++) {
            subList.add(list.get(i));
        }

        return subList;
    }
}
