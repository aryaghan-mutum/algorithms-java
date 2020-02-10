package com.algorithms.functionalprogramming.method_reference;

import lombok.Data;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import java.util.List;

import static com.google.common.collect.Lists.asList;

/**
 * Case 1: Reference to Static method: Use class name to call a static method. Ex: ClassName::staticMethod
 * Case 2: Reference to Instance method: Use this keyword to call an instance method Ex: object::instanceMethod
 * Case 3: Reference to Constructor: Use super keyword to call an instance method
 */

public class MethodReferenceEx2 {
    
    @Data
    class Point {
        private final int x;
        private final int y;
    }
    
    @Test
    public void methodRef() {
        
        List<Point> points = asList(new Point(2, 3), null);
        
        points.stream()
                .mapToInt(Point::getX)
                .forEach(out::println);
    }
    
}

