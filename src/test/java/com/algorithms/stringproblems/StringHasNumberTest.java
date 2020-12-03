package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.CheckStringHasNumber.doesStringHasNumber;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringHasNumberTest {

    @Test
    public void testStringHasNumber() {
        assertTrue(doesStringHasNumber("123"));
        assertFalse(doesStringHasNumber("-123"));
        assertFalse(doesStringHasNumber("123.12"));
        assertFalse(doesStringHasNumber("abcd123"));
        assertFalse(doesStringHasNumber("abcd"));
    }
}
