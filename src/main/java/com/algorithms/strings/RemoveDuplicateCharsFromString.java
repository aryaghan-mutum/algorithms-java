package com.algorithms.strings;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharsFromString {

    public static List<Character> removeDuplicateCharsFuncApproach(String str) {
        return str.chars()
                .distinct().mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}
