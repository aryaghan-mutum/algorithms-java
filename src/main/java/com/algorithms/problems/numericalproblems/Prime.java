package com.algorithms.problems.numericalproblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.lang.System.out;
import static com.utils.Constants.numbersList;

public class Prime {
    
    public static void main(String[] args) {
        
        out.println(isPrimeInIP(3));
        out.println(isPrimeInFP(3));
        
        out.println("Prime Num Count: " + primeNumCount());
        out.println("primesList:" + primes(2, 20));
    }
    
    // imperative style
    private static boolean isPrimeInIP(int num) {
        if (num <= 1)
            return false;
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
    
    public static List<Integer> primes(final int fromNumber, final int count) {
        return Stream.iterate(primeAfter(fromNumber - 1), Prime::primeAfter)
                .limit(count)
                .collect(Collectors.toList());
    }
    
    private static int primeAfter(final int number) {
        if(isPrimeInFP(number + 1))
            return number + 1;
        else
            return primeAfter(number + 1);
    }
    
    // declarative style
    private static boolean isPrimeInFP(int num) {
    
        /*
        return num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(divisor -> num % divisor == 0);
        */
        
        //or
        return num > 1 &&
                IntStream.range(2, num)
                        .noneMatch(divisor -> num % divisor == 0);
    }
    
    /**
     * @return The total count of the prime numbers
     */
    private static long primeNumCount() {
        return numbersList.stream()
                .filter(Prime::isPrimeInFP)
                .count();
    }
}


