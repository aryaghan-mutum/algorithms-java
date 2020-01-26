package com.algorithms.functionalprogramming.lambda_examples.reusing_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReuseLambdaExpressionsEx1 {
    
    public static final List<Integer> numbersList1 = Arrays.asList(new Integer[]{1, 2, 3});
    public static final List<Integer> numbersList2 = Arrays.asList(new Integer[]{2, 3, 4});
    public static final List<Integer> numbersList3 = Arrays.asList(new Integer[]{3, 4, 5});
 
    public static void main(String[] args) {
        
        ReuseLambdaExpressionsEx1 reuseLambdaExpressions = new ReuseLambdaExpressionsEx1();
        
        reuseLambdaExpressions.withoutReusingLambdaExpressionForNumbers();
        reuseLambdaExpressions.reusingLambdaExpressionsForNumbers();
        
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
