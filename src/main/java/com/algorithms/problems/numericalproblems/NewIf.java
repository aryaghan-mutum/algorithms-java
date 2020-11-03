package com.algorithms.problems.numericalproblems;

/**
 * Exercise 1.6: Alyssa P. Hacker doesn’t see why if needs to
 * be provided as a special form. “Why can’t I just define it as
 * an ordinary procedure in terms of cond?” she asks. Alyssa’s
 * friend Eva Lu Ator claims this can indeed be done, and she
 * defines a new version of if:
 */
public class NewIf {
    
    public static  double n = 25;
    public static void main(String[] args) {
        
        double x = newIf((2.0 == 3.0), 0, 5.0);
        System.out.println(x);
        
        double y = newIf((2.0 == 2.0), 0, 5.0);
        System.out.println(y);
    
        System.out.println("Using if: " + findSqrtUsingIf());
        findSqrtUsingNewIf(); // returns  java.lang.StackOverflowError
        
    }
    
    /**
     * new-if uses Applicative Order Evaluation, which means the interpreter first evalautes the arguments and then
     * applies the function.
     * <p>
     * `new-if` procedure causes infinite recursions
     * `if` procedure doesn't cause infinite recursions in this case. That is why if is a special form.
     * <p>
     * new-if is a procedure and not a special form, that is why it evalautes all the operations within the function.
     */
    public static double newIf(boolean predicate, double thenClause, double elseClause) {
        if (predicate) {
            return thenClause;
        } else {
            return elseClause;
        }
    }
    
    public static double findSqrtUsingIf() {
        return tryUsingIf(1.0);
    }
    
    public static double tryUsingIf(double guess) {
        if (isGoodEnough(guess, n)) {
            return guess;
        }else {
            return tryUsingIf(improve(guess));
        }
    }
    
    public static double findSqrtUsingNewIf() {
        return tryUsingNewIf(1.0);
    }
    
    public static double tryUsingNewIf(double guess) {
        return newIf(isGoodEnough(guess, n), guess, tryUsingNewIf(improve(guess)));
    }
    
    public static boolean isGoodEnough(double guess, double n) {
        double x = square(guess) - n;
        return Math.abs(x) < 0.0001;
    }
    
    public static double square(double n) {
        return n * n;
    }
    
    public static double avg(double x, double y) {
        return (x + y) / 2;
    }
    
    public static double improve(double guess) {
        return avg(guess, n/guess);
    }
    
}
