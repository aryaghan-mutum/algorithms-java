package com.algorithms.numerical_computation;

public class EvaluationTechnique {
    
    /**
     * Exercise 1.5. Ben Bitdiddle has invented a test to determine whether the interpreter he is faced with is
     * using applicative-order evaluation or normal-order evaluation. He defines the following two
     * procedures:
     * <p>
     * Note: 'p'is defined recursively.
     * <p>
     * Applicative-order evaluation: will lead to an infinite recursion in this case, because in applicative order evaluation,
     * the arguments are evaluated first and then the function is applied.
     * AQE: We can say it is: "Evaluate the args and then apply!"
     * <p>
     * Normal-order evaluation: The 'p' value is not evaluated, and the test will return 0. In Normal-order ealuation, the arguments
     * are not evalued first like Applicative-order evaluation. Here the expression are expanded until it reaches one operator to apply.
     * NOE: We can say it is: "Fully expand and reduce"
     */
    
    public static void main(String[] args) {
    
    }
    
    public static void p() {
        p();
    }
    
    public static int test(int x, int y) {
        int zero = 0;
        if (x == zero) {
            return zero;
        } else {
            return y;
        }
    }
}
