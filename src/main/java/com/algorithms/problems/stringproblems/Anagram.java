package com.algorithms.problems.stringproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Anagram {

    /**
     * Check two lists are anagram using functional approach
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagramFuncApproach(String str1, String str2) {
        List<String> list1 = str1.chars()
                .sorted()
                .mapToObj(c -> Character.valueOf((char) c))
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        List<String> list2 = str2.chars()
                .sorted()
                .mapToObj(c -> Character.valueOf((char) c))
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        return list1.equals(list2);
    }

    /**
     * Check two lists are anagram using imperative approach
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagramImperApproach(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}
