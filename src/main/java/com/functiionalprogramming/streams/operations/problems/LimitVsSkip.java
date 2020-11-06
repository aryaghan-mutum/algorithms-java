package com.functiionalprogramming.streams.operations.problems;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static com.utils.Constants.numbers;

public class LimitVsSkip {
    
    static Predicate<Integer> numberGreaterThan500 = n -> n > 500;
    
    /**
     * Note:
     * limit() short circuit function
     */
    public static void main(String[] args) {
        
        out.printf("Using limit operation : %s \n ", getElementsUsingLimitOperation(numbers));
        out.printf("Using skip operation: %s \n ", getElementsUsingSkipOperation(numbers));
        
    }
    
    /**
     * returns a limit of 3 sorted integers greater than 500
     */
    private static Set<Integer> getElementsUsingLimitOperation(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .filter(numberGreaterThan500)
                .limit(3)
                .collect(Collectors.toSet());
    }
    
    /**
     * skips three elements of 3 sorted integers greater than 500
     */
    private static Set<Integer> getElementsUsingSkipOperation(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .filter(numberGreaterThan500)
                .skip(3)
                .collect(Collectors.toSet());
    }
    
    
}
