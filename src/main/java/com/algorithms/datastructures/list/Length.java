package com.algorithms.datastructures.list;


import java.util.List;

import static com.utils.Constants.citiesList;
import static com.utils.JavaProjectUtil.cdr;

public class Length {
    
    
    public static int lengthMethod1(List<String> lst) {
        
        int count = 0;
        for (int i = 1; i <= lst.size(); i++) {
            count = count + 1;
        }
        
        return count;
    }
    
    public static int lengthMethod2(List<String> lst) {
        
        if (lst.isEmpty()) {
            return 0;
        } else {
            return (add1(lengthMethod2(cdr(lst))));
        }
    }
    
    public static int lengthMethod3(List<String> lst) {
        
        if (lst.isEmpty()) {
            return 0;
        } else {
            return (1 + lengthMethod2(cdr(lst)));
        }
    }
    
    private static int add1(int num) {
        return num + 1;
    }
    
    
}
