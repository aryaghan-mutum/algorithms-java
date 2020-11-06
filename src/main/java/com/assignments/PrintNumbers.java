package com.assignments;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintNumbers {

    public static void main(String[] args) {

        f1Imper();
        System.out.println(" ");
        f1Func();
    }

    public static void f1Imper() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("number divided by 3:" + i);
            } else if (i % 5 == 0) {
                System.out.println("number divided by 5: " + i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("number divided by 3 & 5: " + i);
            }
        }
    }

    private static void f1Func() {
        IntPredicate predicateDivideBy3 = i -> i % 3 == 0;
        IntPredicate predicateDivideBy5 = i -> i % 5 == 0;
        IntPredicate predicateDivideBy3And5 = i -> i % 3 == 0 && i % 5 == 0;

        IntStream.range(0, 100)
                .filter(predicateDivideBy3)
                .forEach(i ->  System.out.println("number divided by 3:" + i));

        IntStream.range(0, 100)
                .filter(predicateDivideBy5)
                .forEach(i ->  System.out.println("number divided by 5:" + i));

        IntStream.range(0, 100)
                .filter(predicateDivideBy3And5)
                .forEach(i ->  System.out.println("number divided by 3 & 5: " + i));

    }
}
