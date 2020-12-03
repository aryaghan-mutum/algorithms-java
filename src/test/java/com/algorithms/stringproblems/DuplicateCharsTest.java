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

public class DuplicateCharsTest {

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

}
