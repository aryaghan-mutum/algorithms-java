package com.algorithms.listproblems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.algorithms.problems.listproblems.SubList.*;
import static com.google.common.primitives.Longs.asList;
import static org.junit.Assert.assertEquals;

public class SubListTest {

    List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    @Test
    public void testSubListFuncApproach2() {
        assertEquals(getSubListFuncApproach(list, 3, 4), asList(3, 4, 5, 6, 7, 8, 9));
    }

    @Test
    public void testSubListFuncApproach() {
        assertEquals(getSubListFuncApproach2(list, 3, 4), asList(3, 4, 5, 6, 7, 8, 9));
    }

    @Test
    public void testSubListImperApproach() {
        assertEquals(getSubListImperApproach(list, 3, 4), asList(3, 4, 5, 6, 7, 8, 9));
    }

}
