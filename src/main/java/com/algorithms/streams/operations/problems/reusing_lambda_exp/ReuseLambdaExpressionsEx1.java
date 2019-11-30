package com.algorithms.streams.operations.problems.reusing_lambda_exp;

import java.util.function.Predicate;

import static utils.Constants.flowersList1;
import static utils.Constants.flowersList2;
import static utils.Constants.flowersList3;
import static utils.Constants.numbersList1;
import static utils.Constants.numbersList2;
import static utils.Constants.numbersList3;

public class ReuseLambdaExpressionsEx1 {
    
    public static void main(String[] args) {
        
        ReuseLambdaExpressionsEx1 reuseLambdaExpressions = new ReuseLambdaExpressionsEx1();
        
        reuseLambdaExpressions.withoutReusingLambdaExpressionsForStrings();
        reuseLambdaExpressions.reusingLambdaExpressionsForStrings();
        
        reuseLambdaExpressions.withoutReusingLambdaExpressionForNumbers();
        reuseLambdaExpressions.reusingLambdaExpressionsForNumbers();
        
    }
    
    /**
     * Without Reusing the code:
     * The method prints the count of flowers that starts with the letter "a" for the three distinct lists
     */
    private void withoutReusingLambdaExpressionsForStrings() {
        
        System.out.println("Approach 1: Flower list 1 Count: " + flowersList1
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
        
        System.out.println("Approach 1: Flower list 2 Count: " + flowersList2
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
        
        System.out.println("Approach 1: Flower list 3 Count: " + flowersList3
                .stream()
                .filter(flower -> flower.startsWith("a"))
                .count());
    }
    
    /**
     * Reusing the code:
     * The method prints the count of flowers that starts with the letter "a" for the three different lists
     */
    private void reusingLambdaExpressionsForStrings() {
        
        Predicate<String> flowersStartsWithLetterA = flower -> flower.startsWith("a");
        
        System.out.println("Approach 2: Flower list 1 Count: " + flowersList1
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
        
        System.out.println("Approach 2: Flower list 2 Count: " + flowersList2
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
        
        System.out.println("Approach 2: Flower list 3 Count: " + flowersList3
                .stream()
                .filter(flowersStartsWithLetterA)
                .count());
    }
    
    /**
     * Without Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private void withoutReusingLambdaExpressionForNumbers() {
        
        numbersList1
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(number -> number.equals(3))
                .forEach(System.out::println);
    }
    
    /**
     * Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private void reusingLambdaExpressionsForNumbers() {
        
        Predicate<Integer> numberEqualsTo3 = number -> number.equals(3);
        
        numbersList1
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
        
        numbersList2
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
        
        numbersList3
                .stream()
                .filter(numberEqualsTo3)
                .forEach(System.out::println);
    }
}
