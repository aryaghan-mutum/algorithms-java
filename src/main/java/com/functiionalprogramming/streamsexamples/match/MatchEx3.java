package com.functiionalprogramming.streamsexamples.match;

import org.assertj.core.api.SoftAssertions;

import java.util.List;

import static com.utils.Constants.priceList;
import static com.utils.Constants.priceList2;

public class MatchEx3 {

    public static void main(String[] args) {
        testBothApproaches();
    }

    public static void testBothApproaches() {

        SoftAssertions softAssertions = new SoftAssertions();
        
        softAssertions.assertThat(areElementsSameInIP(priceList))
                .as("PASSED: All prices are equal in FP").isTrue();
    
        softAssertions.assertThat(areElementsSameInIP(priceList2))
                .as("FAILED: All prices are equal in FP").isTrue();
    
        softAssertions.assertThat(areElementsSameInFP(priceList))
                .as("PASSED: All prices are equal in FP").isTrue();
    
        softAssertions.assertThat(areElementsSameInFP(priceList2))
                .as("FAILED: All prices are equal in FP").isTrue();
        
        softAssertions.assertAll();
    }
    
    /**
     * Returns true if all the prices are equal in Imperative approach
     */
    public static boolean areElementsSameInIP(List<Double> priceList) {
        
        double firstNum = priceList.get(0);
        
        for (int i = 1; i < priceList.size(); i++) {
            if (!priceList.get(i).equals(firstNum)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Returns true if all the prices are equal in Functional approach
     */
    public static boolean areElementsSameInFP(List<Double> priceList) {
        double firstNum = priceList.get(0);
        
        return priceList
                .stream()
                .allMatch(x -> x.equals(firstNum));
    }
}
