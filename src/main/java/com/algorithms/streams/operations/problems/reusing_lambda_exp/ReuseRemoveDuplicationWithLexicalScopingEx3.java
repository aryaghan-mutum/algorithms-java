package com.algorithms.streams.operations.problems.reusing_lambda_exp;

import java.util.function.Function;
import java.util.function.Predicate;

import static utils.Constants.flowersList1;
import static utils.Constants.flowersList2;
import static utils.Constants.flowersList3;
import static utils.Constants.numbersList1;
import static utils.Constants.numbersList2;
import static utils.Constants.numbersList3;

public class ReuseRemoveDuplicationWithLexicalScopingEx3 {
    
    public static void main(String[] args) {
        
        ReuseRemoveDuplicationWithLexicalScopingEx3 reuseLambdaExpressionsWithLexicalScoping = new ReuseRemoveDuplicationWithLexicalScopingEx3();
        
        reuseLambdaExpressionsWithLexicalScoping.reusingLambdaExpressionsWithLexicalScopingForStrings();
        
        reuseLambdaExpressionsWithLexicalScoping.reusingLambdaExpressionsWithLexicalScopingForNumbers();
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
    private void reusingLambdaExpressionsWithLexicalScopingForStrings() {
        
        System.out.println("Approach 4: Flower list 1 Count alphabet 'a': " + flowersList1
                .stream()
                .filter(flowerNameStartsWith.apply("a"))
                .count());
        
        System.out.println("Approach 4: Flower list 2 Count for alphabet 'p': " + flowersList2
                .stream()
                .filter(flowerNameStartsWith.apply("p"))
                .count());
        
        System.out.println("Approach 4: Flower list 3 Count for alphabet 'l': " + flowersList3
                .stream()
                .filter(flowerNameStartsWith.apply("l"))
                .count());
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
    private void reusingLambdaExpressionsWithLexicalScopingForNumbers() {
        
        numbersList1
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(2))
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(3))
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(verifyIfTheNumberEqualsTo3.apply(4))
                .forEach(System.out::println);
    }
    
}
