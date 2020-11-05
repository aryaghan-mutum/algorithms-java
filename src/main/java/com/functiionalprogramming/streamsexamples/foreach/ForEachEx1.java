package com.functiionalprogramming.streamsexamples.foreach;

import java.util.Random;

/**
 * Algorithm:
 * Define a method which generates 5 random numbers both in iterative and declarative style.
 */
public class ForEachEx1 {

    public static void main(String[] args) {
        testGetFiveRandNumbersImperativeApproach();
        testGetFiveRandNumbersFunctionalApproach();
    }

    /**
     * Not Advised: Iterative Approach
     */
    public static void testGetFiveRandNumbersImperativeApproach() {
        for (int i = 0; i < 5; i++) {
            double randNum = ((Math.random()));
            System.out.println("Rand # imperative approach: " + randNum);
        }
    }
    
    /**
     * Advised: Functional Approach
     */
    public static void testGetFiveRandNumbersFunctionalApproach() {
        Random random = new Random();
        random.doubles().limit(5).forEach(randNum -> System.out.println("Rand # functional approach: " + randNum));
    }
    
}
