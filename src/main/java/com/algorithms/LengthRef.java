package com.algorithms;

import java.util.List;

import static com.utils.JavaProjectUtil.car;
import static com.utils.JavaProjectUtil.cdr;

public class LengthRef {

    /**
     *
     * @param n
     * @param lst
     * @return
     */
    public static int lengthRef(int n, List<Integer> lst) {
        if (n == 0) {
            return car(lst);
        } else {
            return lengthRef(n - 1, cdr(lst));
        }
    }
}
