package com.algorithms.numerproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.numericalproblems.Fibonacci.fibonacci;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() throws Exception {
        assertEquals(fibonacci(10), 55);
    }

}
