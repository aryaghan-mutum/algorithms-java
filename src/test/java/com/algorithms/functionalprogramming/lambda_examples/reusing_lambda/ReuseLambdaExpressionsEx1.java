package com.algorithms.functionalprogramming.lambda_examples.reusing_lambda;

import static java.lang.System.out;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class ReuseLambdaExpressionsEx1 {
    
    public static final List<Integer> numbersList1 = asList(new Integer[]{1, 2, 3});
    public static final List<Integer> numbersList2 = asList(new Integer[]{2, 3, 4});
    public static final List<Integer> numbersList3 = asList(new Integer[]{3, 4, 5});
    
    public static void main(String[] args) {
        new ReuseLambdaExpressionsEx1()
                .withoutReusingLambdaExpressionForNumbers()
                .reusingLambdaExpressionsForNumbers();
    }
    
    /**
     * Without Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private ReuseLambdaExpressionsEx1 withoutReusingLambdaExpressionForNumbers() {
        
        numbersList1
                .stream()
                .filter(number -> number.equals(3))
                .forEach(out::println);
        
        numbersList2
                .stream()
                .filter(number -> number.equals(3))
                .forEach(out::println);
        
        numbersList3
                .stream()
                .filter(number -> number.equals(3))
                .forEach(out::println);
        return this;
    }
    
    /**
     * Reusing the code:
     * The method prints the number if the given number is equal to the number present in the list for three different lists
     */
    private ReuseLambdaExpressionsEx1 reusingLambdaExpressionsForNumbers() {
        
        Predicate<Integer> numberEqualsTo3 = number -> number.equals(3);
        
        numbersList1
                .stream()
                .filter(numberEqualsTo3)
                .forEach(out::println);
        
        numbersList2
                .stream()
                .filter(numberEqualsTo3)
                .forEach(out::println);
        
        numbersList3
                .stream()
                .filter(numberEqualsTo3)
                .forEach(out::println);
        return this;
    }
}
