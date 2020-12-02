package com.algorithms.listproblems;

import com.algorithms.problems.listproblems.FindCommonElemsFromTwoArrays;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.algorithms.problems.listproblems.FindCommonElemsFromTwoArrays.*;
import static com.google.common.primitives.Ints.asList;
import static org.junit.Assert.assertEquals;

public class CommonElemsFromTwoListsTest {

    @Test
    public void testCommonElemsFuncApproach() {
        List<Integer> list1 = asList(1, 2, 3);
        List<Integer> list2 = asList(2, 3, 4);
        assertEquals(findCommonElementsFuncApproach(list1, list2), asList(2, 3));
    }

    @Test
    public void testCommonElemsImperApproach() {
        List<Integer> list1 = asList(1, 2, 3);
        List<Integer> list2 = asList(2, 3, 4);
        assertEquals(findCommonElementsImperApproach(list1, list2), asList(2, 3));
    }

    @Test
    public void testCommonElemsImperApproach2() {
        int arr1[] = {1, 2, 5, 7, 89, 3};
        int arr2[] = {1, 45, 87, 34, 3};
        findCommonElementsImperApproach2(arr1, arr2);
    }
}
