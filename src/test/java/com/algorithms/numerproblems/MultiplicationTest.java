package com.algorithms.numerproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.numericalproblems.Multiplication.multiply;
import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    @Test
    public void testMultiplication() {
        assertEquals(multiply(3, 4), 12);
        assertEquals(multiply(5, 4), 20);
        assertEquals(multiply(-5, 4), -20);
        //assertEquals(multiply(5, -4), -20);
        //assertEquals(multiply(-5, -4), 20);
    }
}
