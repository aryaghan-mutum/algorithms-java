package com.algorithms.problems.listproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicatesFuncApproach(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> removeDuplicatesImperApproach(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();

        for(int i : list) {
            if(!resultList.contains(i)) {
                resultList.add(i);
            }
        }
        return resultList;
    }

}
