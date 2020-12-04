package com.algorithms.problems.listproblems;

import java.util.List;

public class SumNumbers {

    public static int sumNumbersFuncApproach1(List<Integer> list) {
        return list.stream().reduce(0, (x,y) -> x+y);
    }

    public static int sumNumbersFuncApproach2(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    /**
     * @param list
     * @return
     */
    public static int sumNumbersImperApproach(List<Integer> list) {
        int count = 0;

        for (int i : list) {
            count = count + i;
        }

        return count;
    }
}
