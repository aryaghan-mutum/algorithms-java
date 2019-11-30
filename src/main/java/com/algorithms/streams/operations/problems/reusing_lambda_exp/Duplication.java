package com.algorithms.streams.operations.problems.reusing_lambda_exp;

import java.util.List;
import java.util.function.BinaryOperator;

import static java.util.Arrays.asList;

public class Duplication {
    
    public static void main(String[] args) {
        List<Integer> numbersList = asList(1, 2, 3, 4, 5);
        
        System.out.println(add(numbersList));
        System.out.println(mul(numbersList));
    
        System.out.println(addUsingLambda(numbersList));
        System.out.println(mulUsingLambda(numbersList));
    }
    
    /**
     * add: with duplication
     */
    public static int add(List<Integer> numbersList) {
        int sum = 0;
        for (int n : numbersList) {
            sum += n;
        }
        return sum;
    }
    
    /**
     * mul: with duplication
     */
    public static int mul(List<Integer> numbersList) {
        int product = 1;
        for (int n : numbersList) {
            product *= n;
        }
        return product;
    }
    
    
    /**
     * add: refactor with lambda
     */
    public static int addUsingLambda(List<Integer> numbersList) {
        return reduce(numbersList, 0, (x, y) -> x + y);
    }
    
    /**
     * mul: refactor with lambda
     */
    public static int mulUsingLambda(List<Integer> numbersList) {
        return reduce(numbersList, 1, (x, y) -> x * y);
    }
    
    public static Integer reduce(List<Integer> numbers, Integer unit, BinaryOperator<Integer> operator) {
        Integer result = unit;
        for (Integer n : numbers) {
            result = operator.apply(result, n);
        }
        return result;
    }
    
}
