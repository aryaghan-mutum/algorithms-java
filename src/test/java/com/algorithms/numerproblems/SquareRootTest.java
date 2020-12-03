package com.algorithms.numerproblems;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.algorithms.problems.numericalproblems.SquareRoot.sqrtRootMethod1;
import static com.algorithms.problems.numericalproblems.SquareRoot.sqrtRootMethod2;

public class SquareRootTest {

    @Test
    public void testSquareRootVersion1() {
        Assertions.assertEquals(sqrtRootMethod1(25), 4.99267578125);
    }

    @Test
    public void testSquareRootVersion2() {
        Assertions.assertEquals(sqrtRootMethod2(25), 4.6875);
    }
}
