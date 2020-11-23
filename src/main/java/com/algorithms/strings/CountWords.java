package com.algorithms.strings;

import java.util.StringTokenizer;

/**
 * @author Anurag Muthyam
 * How to count the words in a string
 */
public class CountWords {

    public static void main(String[] args) {
        String sentence = "hello it is java !";
        System.out.println(countWords(sentence));
        System.out.println(countWordsStringTokenizer(sentence));
        System.out.println(countWordsWithoutUsingBuiltinMethods(sentence));
    }

     static int countWords(String sentence) {
        if (sentence.isEmpty() || sentence == null) return 0;
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static int countWordsStringTokenizer(String sentence) {
        if (sentence.isEmpty() || sentence == null) return 0;
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public static int countWordsWithoutUsingBuiltinMethods(String sentence) {
        int wordCount = 0;
        boolean word = false;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)) && i != sentence.length()) {
                word = true;
            } else if (!Character.isLetter(sentence.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(sentence.charAt(i)) && i == sentence.length()) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
