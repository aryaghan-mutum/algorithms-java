package com.algorithms.numerical_computation;

import static com.utils.Constants.numbersList;

public class Other {
    
    public static void main(String[] args) {
        f();
    }
    
    public static void f() {
        int output = 0;
        for (int num : numbersList) {
            if (num > 3 && num % 2 == 0) {
                output = num * 2;
                break;
            }
        }
       
        System.out.println(output);
        
        numbersList.stream()
                .filter(n -> n > 3)
                .filter(n -> n % 2 == 0)
                .map(d -> doubleIt(d))
                .findFirst()
                .get();
    }
    
    public static int doubleIt(int n) {
        n = n * 2;
        return n;
    }
}
