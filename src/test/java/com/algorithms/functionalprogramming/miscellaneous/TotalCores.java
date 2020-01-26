package com.algorithms.functionalprogramming.miscellaneous;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TotalCores {
    
    @Test
    public void testTotalCoresInMyMachine() {
        int totalCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Total Cores: " + totalCores);
        Assertions.assertEquals(12, totalCores);
    }
}
