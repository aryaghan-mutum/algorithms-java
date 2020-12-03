package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import static com.algorithms.problems.stringproblems.RemoveWhiteSpaces.removeWhiteSpaces;
import static com.algorithms.problems.stringproblems.RemoveWhiteSpaces.removeWhiteSpacesFuncApproach;
import static org.junit.Assert.assertEquals;

public class RemoveWhiteSpacesTest {

    @Test
    public void testRemoveWhiteSpaces() {
        assertEquals(removeWhiteSpaces("welcome to earth !"), "welcometoearth!");
        assertEquals(removeWhiteSpaces("welcometoearth!"), "welcometoearth!");
    }

    @Test
    public void testRemoveWhiteSpacesFuncApproach() {
        assertEquals(removeWhiteSpacesFuncApproach("welcome to earth !"), "welcometoearth!");
        assertEquals(removeWhiteSpacesFuncApproach("welcometoearth!"), "welcometoearth!");
    }
}
