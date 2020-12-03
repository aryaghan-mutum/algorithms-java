package com.algorithms.problems.stringproblems;

import java.util.stream.Collectors;

public class RemoveWhiteSpaces {

    /**
     * Remove white spaces using replaceAll()
     *
     * @param str
     * @return
     */
    public static String removeWhiteSpaces(String str) {
        str = str.replaceAll("\\s", "");
        return str;
    }

    /**
     * Remove white spaces using functional approach
     *
     * @param str
     * @return
     */
    public static String removeWhiteSpacesFuncApproach(String str) {
        return str.chars()
                .filter(c -> !Character.isSpaceChar(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
