package com.algorithms.problems.stringproblems;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    /**
     * Reverse a string using mapToObj
     *
     * @param str
     * @return
     */
    public static String reverseStringApproach1(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

    /**
     * Reverse a string using StringBuilder
     *
     * @param str
     * @return
     */
    public static String reverseStringApproach2(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    /**
     * Reverse a string using StringBuffer
     *
     * @param str
     * @return
     */
    public static String reverseStringApproach3(String str) {
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse;
    }

}
