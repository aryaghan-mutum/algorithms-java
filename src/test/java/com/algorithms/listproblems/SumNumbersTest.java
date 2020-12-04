package com.algorithms.listproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.algorithms.problems.listproblems.SumNumbers.sumNumbersImperApproach;

public class SumNumbersTest {

    @Test
    public void testSumImperApproach() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(sumNumbersImperApproach(list), 55);
    }
}
