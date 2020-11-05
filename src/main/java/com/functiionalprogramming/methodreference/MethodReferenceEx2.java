package com.functiionalprogramming.methodreference;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;


/**
 * Case 1: Reference to Static method: Use class name to call a static method. Ex: ClassName::staticMethod
 * Case 2: Reference to Instance method: Use this keyword to call an instance method Ex: object::instanceMethod
 * Case 3: Reference to Constructor: Use super keyword to call an instance method
 */

public class MethodReferenceEx2 {

    public static void main(String[] args) {
        methodRef();
    }

    public static void methodRef() {
        List<Point> points = Arrays.asList(new Point(2, 3), null);
        points.stream()
                .mapToInt(Point::getX)
                .forEach(out::println);
    }
}

class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

