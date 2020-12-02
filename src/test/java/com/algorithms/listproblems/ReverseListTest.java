package com.algorithms.listproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.listproblems.ReverseList.sortAndReverseListFuncApproach;
import static com.google.common.primitives.Ints.asList;
import static org.junit.Assert.assertEquals;

public class ReverseListTest {

    @Test
    public void testReverseFuncApproach() {
        assertEquals(sortAndReverseListFuncApproach(asList(1, 2, 3, 2)), asList(3, 2, 2, 1));
        assertEquals(sortAndReverseListFuncApproach(asList(2, 2)), asList(2, 2));
        assertEquals(sortAndReverseListFuncApproach(asList(9, 8, 7)), asList(9, 8, 7));
        assertEquals(sortAndReverseListFuncApproach(asList(9)), asList(9));
    }

}
