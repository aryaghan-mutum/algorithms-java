package com.algorithms.stringproblems;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;
import static org.junit.Assert.*;

public class DuplicateElemTest {

    /**
     * Approach 1 using groupingBy() and counting() functions
     * Algorithm:
     * step 1: convert a string to a list of chars
     * step 2: group the elements
     * step 3: count the elements
     * step 4: return it in a Map instance.
     * <p>
     * <p>
     * Note: groupingBy() is a procedure which is similar to GROUP BY in SQL language
     * essentially we are using groupingBy() to group elements and store results in a Map data structure.
     * <p>
     * Note: counting() is a terminal procedure in java 8.
     * It is used to count the total num of objects and counts the number of inputs which we store it as values in Map.
     */
    public static Map<Character, Long> solve1(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Approach 2 using toMap()
     * Algorithm:
     * - str.chars() returns IntStream of characters, therefore we have to box them to Integer
     * and since we want to return a key and value pair we are using toMap() procedure.
     * - key has keys in a data structure
     * - value has values in a data structure
     */
    public static Map<Character, Integer> solve2(String str) {
        return str.chars().boxed()
                .collect(toMap(
                        key -> Character.valueOf((char) key.intValue()),
                        value -> 1,
                        Integer::sum));
    }

    @Test
    public void testSolve2() {
        String str = "aabbbCC";
        assertEquals(solve2(str).size(), 3);
        assertTrue(solve2(str).keySet().contains('a'));
        assertTrue(solve2(str).keySet().contains('C'));
        assertFalse(solve2(str).keySet().contains('X'));
        assertEquals(solve2(str).toString(), "{a=2, b=3, C=2}");
        assertEquals(solve2(str).isEmpty(), false);
        assertNotNull("Provided Map is null;", solve2(str));
    }
}