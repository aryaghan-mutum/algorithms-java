package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.Anagram.isAnagramFuncApproach;
import static com.algorithms.problems.stringproblems.Anagram.isAnagramImperApproach;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

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
}
