package com.algorithms.datastructures.list;

import java.util.List;

import static com.utils.JavaProjectUtil.car;
import static com.utils.JavaProjectUtil.cdr;

public class LengthRef {
    
    public static int lengthRef(int n, List<Integer> lst) {
        if (n == 0) {
            return car(lst);
        } else {
            return lengthRef(n - 1, cdr(lst));
        }
    }
}
