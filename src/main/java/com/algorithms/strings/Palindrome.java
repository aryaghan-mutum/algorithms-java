package com.algorithms.strings;

import java.util.stream.Collectors;

public class Palindrome {

    public static boolean isStringPalindromeFuncApproach(String str) {
        String reversedStr = str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

        return str.equals(reversedStr);
    }

    public static boolean isStringPalindromeImperApproach(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
