package com.algorithms.listproblems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.algorithms.problems.listproblems.SquareList.squareListFuncApproach;
import static com.algorithms.problems.listproblems.SquareList.squareListImperApproach;
import static com.google.common.primitives.Longs.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author Anurag Muthyam
 */

public class DoubleListTest {

    @Test
    public void testDoubleListFuncApproach() {
        assertEquals(squareListFuncApproach(Arrays.asList(-2, 0, 1, 2, 3)), asList(4, 0, 2, 4, 9));
    }

    @Test
    public void testDoubleListImperApproach() {
        assertEquals(squareListImperApproach(Arrays.asList(-2, 0, 1, 2, 3)), asList(4, 0, 2, 4, 9));
    }
}
