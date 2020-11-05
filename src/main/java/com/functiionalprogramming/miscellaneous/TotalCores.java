package com.functiionalprogramming.miscellaneous;

import org.junit.jupiter.api.Assertions;

public class TotalCores {

    public static void main(String[] args) {
        testTotalCoresInMyMachine();
    }

    public static void testTotalCoresInMyMachine() {
        int totalCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Total Cores: " + totalCores);
        Assertions.assertEquals(12, totalCores);
    }
}
