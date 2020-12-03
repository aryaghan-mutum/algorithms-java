package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.Palindrome.isStringPalindromeFuncApproach;
import static com.algorithms.problems.stringproblems.Palindrome.isStringPalindromeImperApproach;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testPalindromeFuncApproach() {
        assertTrue(isStringPalindromeFuncApproach("abba"));
        assertFalse(isStringPalindromeFuncApproach("lennon"));
    }

    @Test
    public void testPalindromeImperApproach() {
        assertTrue(isStringPalindromeImperApproach("abba"));
        assertFalse(isStringPalindromeImperApproach("lennon"));
    }
}
