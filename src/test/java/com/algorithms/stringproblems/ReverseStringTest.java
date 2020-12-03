package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.ReverseString.*;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseStringFuncApproach1() {
        assertEquals(reverseStringApproach1("Anurag"), "garunA");
    }

    @Test
    public void testReverseStringFuncApproach2() {
        assertEquals(reverseStringApproach2("Anurag"), "garunA");
    }

    @Test
    public void testReverseStringFuncApproach3() {
        assertEquals(reverseStringApproach3("Anurag"), "garunA");
    }

}
