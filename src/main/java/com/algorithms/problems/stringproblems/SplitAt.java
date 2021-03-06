package com.algorithms.problems.stringproblems;

import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class SplitAt {

    public static void main(String[] args) {
        splitAt("HaskellTutorial", 7);
    }
    
    public static String splitAt(String str, int pos) {
        List<Character> lst = str.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.toList());
        
        for (int i = 1; i < lst.size(); i++) {
            if (i == pos) {
                lst.add(7, ',');
            }
        }
        
        out.println();
        return null;
    }
}
