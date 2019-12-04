package com.algorithms.streams.operations.operators;

import static com.utils.Constants.numbers;

/**
 * @author Anurag Muthyam
 */

public class StreamsCount {
    
    public static void main(String[] args) {
    
        getCountForNumsGreaterThan6();
    }
    
    public static void getCountForNumsGreaterThan6() {
        
        System.out.println(numbers.stream()
                .filter(number -> number > 4)
                .count());                        //6
    }
    
    
}
