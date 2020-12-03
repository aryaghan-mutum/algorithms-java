package com.algorithms.numerproblems;

import static com.algorithms.problems.numericalproblems.Factorial.factorialIterativeProcess;
import static com.algorithms.problems.numericalproblems.Factorial.factorialRecursiveProcess;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorialIterApproach() {
        assertEquals(factorialIterativeProcess(10), 3628800);
    }

    @Test
    public void testFactorialRecApproach() {
        assertEquals(factorialRecursiveProcess(10), 3628800);
    }

}
