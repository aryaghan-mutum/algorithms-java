package com.functiionalprogramming.lambdaexamples.reusing_lambda;

import static java.lang.System.out;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ReuseRemoveDuplicationWithLexicalScopingEx3 {
    
    public static final List<Integer> numbersList1 = asList(new Integer[]{1, 2, 3});
    public static final List<Integer> numbersList2 = asList(new Integer[]{2, 3, 4});
    public static final List<Integer> numbersList3 = asList(new Integer[]{3, 4, 5});
    
    public static final List<String> flowersList1 = asList(new String[]{"angelonia", "snapdragon", "laceleaf", "primrose", "hollyhock", "cyclamen"});
    public static final List<String> flowersList2 = asList(new String[]{"sun flower", "larkspur", "pansy", "anemone", "snowdrop", "peony"});
    public static final List<String> flowersList3 = asList(new String[]{"lily", "amaranth", "crown imperial", "lavender", "amaryllis", "honeysuckle"});
    
    public static void main(String[] args) {
        new ReuseRemoveDuplicationWithLexicalScopingEx3()
                .reusingLambdaExpressionsWithLexicalScopingForStrings()
                .reusingLambdaExpressionsWithLexicalScopingForNumbers();
    }
    
    /**
     * This is same as verifyIfTheFlowerNameStartsWith() but even lesser code:
     * It takes any alphabet and checks if the flower starts with a certain alphabet
     */
    final Function<String, Predicate<String>> flowerNameStartsWith = alphabet -> flower -> flower.startsWith(alphabet);
    
    /**
     * Reusing the code:
     * The method prints the count of flowers that starts with any letter based on users input for the three different lists
     */
    private ReuseRemoveDuplicationWithLexicalScopingEx3 reusingLambdaExpressionsWithLexicalScopingForStrings() {
        
        out.println("Approach 4: Flower list 1 Count alphabet 'a': " + flowersList1
                .stream()
                .filter(flowerNameStartsWith.apply("a"))
                .count());
        
        out.println("Approach 4: Flower list 2 Count for alphabet 'p': " + flowersList2
                .stream()
                .filter(flowerNameStartsWith.apply("p"))
                .count());
        
        out.println("Approach 4: Flower list 3 Count for alphabet 'l': " + flowersList3
                .stream()
                .filter(flowerNameStartsWith.apply("l"))
                .count());
        return this;
    }
    
    /**
     * This is same as verifyIfTheNumberEqualsTo3() but even lesser code:
     * It takes any number and checks if the number equals with a number present in the list
     */
    final Function<Integer, Predicate<Integer>> verifyIfTheNumberEqualsTo3 = number -> n -> n.equals(number);
    
    /**
     * Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private ReuseRemoveDuplicationWithLexicalScopingEx3 reusingLambdaExpressionsWithLexicalScopingForNumbers() {
        
        numbersList1
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(2))
                .forEach(out::println);
        
        numbersList2
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(3))
                .forEach(out::println);
        
        numbersList3
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(4))
                .forEach(out::println);
        return this;
    }
    
}
