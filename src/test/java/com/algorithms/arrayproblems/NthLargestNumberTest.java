package com.algorithms.arrayproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.listproblems.FindNthLargestNumber.getNthLargestNumberFuncApproach;
import static com.algorithms.problems.listproblems.FindNthLargestNumber.getNthLargestNumberImperApproach;
import static org.junit.Assert.assertEquals;

public class NthLargestNumberTest {

    @Test
    public void testNthLargestNumberArrayFuncApproach() {
        int[] arr = new int[]{5, 9, 2, 3, 11, 15, 14};
        assertEquals(getNthLargestNumberFuncApproach(arr, 0), 2);
        assertEquals(getNthLargestNumberFuncApproach(arr, 1), 3);
        assertEquals(getNthLargestNumberFuncApproach(arr, 2), 5);
        assertEquals(getNthLargestNumberFuncApproach(arr, 3), 9);
        assertEquals(getNthLargestNumberFuncApproach(arr, 4), 11);
        assertEquals(getNthLargestNumberFuncApproach(arr, 5), 14);
        assertEquals(getNthLargestNumberFuncApproach(arr, 6), 15);
    }

    @Test
    public void testNthLargestNumberArrayImperApproach() {
        int[] arr = new int[]{5, 9, 2, 3, 11, 15, 14};
//        assertEquals(getNthLargestNumberImperApproach(arr, 0), 2);
//        assertEquals(getNthLargestNumberImperApproach(arr, 1), 3);
//        assertEquals(getNthLargestNumberImperApproach(arr, 2), 5);
//        assertEquals(getNthLargestNumberImperApproach(arr, 3), 9);
//        assertEquals(getNthLargestNumberImperApproach(arr, 4), 11);
//        assertEquals(getNthLargestNumberImperApproach(arr, 5), 14);
//        assertEquals(getNthLargestNumberImperApproach(arr, 6), 15);
    }
}
