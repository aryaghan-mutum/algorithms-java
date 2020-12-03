package com.algorithms.numerproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.numericalproblems.ReverseNumber.reverseNumber;
import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testReverseNumber() {
        assertEquals(reverseNumber(12345), 54321);
        assertEquals(reverseNumber(54321), 12345);
    }
}
