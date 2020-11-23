package com.algorithms.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Anurag";
        System.out.println(reverseStringApproach1(str));
        System.out.println(reverseStringApproach2(str));
        System.out.println(reverseStringApproach3(str));
    }

    private static String reverseStringApproach1(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

    private static String reverseStringApproach2(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseStringApproach3(String string) {
        String reverse = new StringBuffer(string).reverse().toString();
        return reverse;
    }

}
