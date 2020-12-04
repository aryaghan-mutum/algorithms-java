package com.algorithms.listproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.algorithms.problems.listproblems.SumNumbers.*;

public class SumNumbersTest {

    @Test
    public void testSumImperApproach() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(sumNumbersImperApproach(list), 55);
    }

    @Test
    public void testSumFuncApproach1() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(sumNumbersFuncApproach1(list), 55);
    }

    @Test
    public void testSumFuncApproach2() {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(sumNumbersFuncApproach2(list), 55);
    }
}
