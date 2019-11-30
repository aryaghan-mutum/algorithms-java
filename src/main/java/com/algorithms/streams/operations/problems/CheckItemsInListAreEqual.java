package com.algorithms.streams.operations.problems;

import java.util.List;

import static utils.Constants.priceList;
import static utils.Constants.priceList2;

public class CheckItemsInListAreEqual {
    
    public static void main(String[] args) {
        
        if (areElementsSameInFP(priceList)) {
            System.out.println("PASSED. All prices are equal in FP");
        } else {
            System.out.println("FAILED. Not all prices are equal in FP");
        }
        
        if (areElementsSameInFP(priceList2)) {
            System.out.println("PASSED. All prices are equal in FP");
        } else {
            System.out.println("FAILED. Not all prices are equal in FP");
        }
        
        if (areElementsSameInIP(priceList)) {
            System.out.println("PASSED. All prices are equal in IP");
        } else {
            System.out.println("FAILED. Not all prices are equal in IP");
        }
        
        if (areElementsSameInIP(priceList2)) {
            System.out.println("PASSED. All prices are equal in IP");
        } else {
            System.out.println("FAILED. Not all prices are equal in IP");
        }
        
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
}
