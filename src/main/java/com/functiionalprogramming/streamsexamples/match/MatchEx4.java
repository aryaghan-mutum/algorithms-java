package com.functiionalprogramming.streamsexamples.match;

import org.assertj.core.api.SoftAssertions;

import java.util.stream.IntStream;

public class MatchEx4 {

    public static void main(String[] args) {
        testIsPrimeProcedures();
    }

    public static void testIsPrimeProcedures() {
        SoftAssertions softAssertions = new SoftAssertions();
        
        softAssertions.assertThat(isPrimeInImperativeApproach(10)).isFalse();
        softAssertions.assertThat(isPrimeInImperativeApproach(13)).isTrue();
        softAssertions.assertThat(isPrimeInDeclarativeApproach1(10)).isFalse();
        softAssertions.assertThat(isPrimeInImperativeApproach(13)).isTrue();
        
        softAssertions.assertThat(isPrimeInDeclarativeApproach1(13)).isEqualTo(isPrimeInDeclarativeApproach2(13));
        softAssertions.assertThat(isPrimeInDeclarativeApproach1(26)).isEqualTo(isPrimeInDeclarativeApproach2(26));
        
        softAssertions.assertAll();
    }
    
    // imperative style
    private static boolean isPrimeInImperativeApproach(int num) {
        if (num <= 1)
            return false;
        
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
    
    // declarative style
    private static boolean isPrimeInDeclarativeApproach1(int num) {
        return num > 1 &&
                IntStream.range(2, num)
                        .noneMatch(divisor -> num % divisor == 0);
    }
    
    private static boolean isPrimeInDeclarativeApproach2(int num) {
        return num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .noneMatch(divisor -> num % divisor == 0);
    }
    
}
