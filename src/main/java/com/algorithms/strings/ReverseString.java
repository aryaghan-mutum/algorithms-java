package com.algorithms.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static String reverseStringApproach1(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

    public static String reverseStringApproach2(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseStringApproach3(String string) {
        String reverse = new StringBuffer(string).reverse().toString();
        return reverse;
    }

}
