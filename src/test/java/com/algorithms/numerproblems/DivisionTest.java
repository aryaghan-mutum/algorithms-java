package com.algorithms.numerproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.numericalproblems.Division.division;
import static org.junit.Assert.assertEquals;


public class DivisionTest {

    @Test
    public void testDivision() {
        assertEquals(division(13, 2), 6);
        assertEquals(division(2, 13), 0);
    }
}
