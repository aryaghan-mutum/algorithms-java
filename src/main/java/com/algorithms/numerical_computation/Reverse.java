package com.algorithms.numerical_computation;

import static java.lang.System.out;

public class Reverse {
    
    public static void main(String[] args) {
        
        int num = 54321, reverse = 0;
        
        while (num != 0) {
            int a = num % 10;
            reverse = reverse * 10 + a;
            num = num / 10;
        }
        
        out.println(reverse);
    }
    
    
}
