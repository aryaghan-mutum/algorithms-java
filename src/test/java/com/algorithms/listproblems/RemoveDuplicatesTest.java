package com.algorithms.listproblems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.algorithms.problems.listproblems.RemoveDuplicates.removeDuplicatesFuncApproach;
import static com.algorithms.problems.listproblems.RemoveDuplicates.removeDuplicatesImperApproach;
import static com.google.common.primitives.Ints.asList;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testDuplicatesFuncApproach() {
        assertEquals(removeDuplicatesFuncApproach(asList(1, 2, 3, 2)), asList(1, 2, 3));
        assertEquals(removeDuplicatesFuncApproach(asList(2, 2)), asList(2));
    }

    @Test
    public void testDuplicatesImperApproach() {
        assertEquals(removeDuplicatesImperApproach(asList(1, 2, 3, 2)), asList(1, 2, 3));
        assertEquals(removeDuplicatesImperApproach(asList(2, 2)), asList(2));
    }
}
