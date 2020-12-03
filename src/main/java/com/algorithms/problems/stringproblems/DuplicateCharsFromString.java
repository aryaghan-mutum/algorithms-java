package com.algorithms.problems.stringproblems;

import java.util.*;
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

    /**
     *
     * @param str
     */
    public static void findDuplicateCharsImperApproach2(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    System.out.print(chars[j] + " ");
                    break;
                }
            }
        }
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
