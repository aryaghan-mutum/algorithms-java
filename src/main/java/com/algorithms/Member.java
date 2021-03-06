package com.algorithms;

import java.util.List;
import static com.utils.JavaProjectUtil.car;
import static com.utils.JavaProjectUtil.cdr;

public class Member {

    /**
     *
     * @param obj
     * @param lst
     * @return
     */
    public static List<Integer> member(int obj, List<Integer> lst) {
        if (lst.isEmpty()) {
            return null;
        } else if (car(lst) == obj) {
            return lst;
        } else {
            return member(obj, (cdr(lst)));
        }
    }
    
}
