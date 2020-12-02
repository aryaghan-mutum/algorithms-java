package com.algorithms.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsFromString {

    public static Set<Character> findDuplicateCharsImperApproach(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for (Character c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> keys = map.keySet();
        return keys;
    }

    public static List<String> findDuplicateCharsFuncApproach(String str) {
        List<String> x = str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());

        Map<Character, Long> x2 = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println();

        return x;
    }


}
