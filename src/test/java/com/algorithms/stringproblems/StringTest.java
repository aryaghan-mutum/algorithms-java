package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static com.algorithms.problems.stringproblems.Anagram.isAnagramFuncApproach;
import static com.algorithms.problems.stringproblems.Anagram.isAnagramImperApproach;
import static com.algorithms.problems.stringproblems.CheckStringHasNumber.doesStringHasNumber;
import static com.algorithms.problems.stringproblems.DuplicateCharsFromString.findDuplicateCharsImperApproach;
import static com.algorithms.problems.stringproblems.Palindrome.isStringPalindromeFuncApproach;
import static com.algorithms.problems.stringproblems.Palindrome.isStringPalindromeImperApproach;
import static com.algorithms.problems.stringproblems.RemoveDuplicateCharsFromString.removeDuplicateCharsFuncApproach;
import static com.algorithms.problems.stringproblems.ReverseString.*;
import static org.junit.Assert.*;

public class StringTest {

    @Test
    public void testAnagramFuncApproach() {
        assertTrue(isAnagramFuncApproach("listen", "silent"));
        assertFalse(isAnagramFuncApproach("listene", "silent"));
        assertFalse(isAnagramFuncApproach("listen", "sileent"));
    }

    @Test
    public void testAnagramImperApproach() {
        char[] str1 = {'l', 'i', 's', 't', 'e', 'n'};
        char[] str2 = {'s', 'i', 'l', 'e', 'n', 't'};
        assertTrue(isAnagramImperApproach(str1, str2));
    }

    @Test
    public void testDuplicateCharsImperApproach() {
        findDuplicateCharsImperApproach("java");
        Set<Character> c = findDuplicateCharsImperApproach("Programming");
        System.out.println();
    }

    @Test
    public void testRemoveDuplicateCharsFuncApproach() {
        System.out.println(removeDuplicateCharsFuncApproach("java"));
    }

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

    @Test
    public void testStringHasNumber() {
        assertTrue(doesStringHasNumber("123"));
        assertFalse(doesStringHasNumber("-123"));
        assertFalse(doesStringHasNumber("123.12"));
        assertFalse(doesStringHasNumber("abcd123"));
        assertFalse(doesStringHasNumber("abcd"));
    }

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
