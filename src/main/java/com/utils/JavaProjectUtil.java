package com.utils;

import java.util.List;

public class JavaProjectUtil {
    
    /**
     * Convenience shortcut method for logging.
     */
    public static void log(String format, Integer... args) {
        System.out.printf(format, args);
        System.out.println("");
    }
    
    public static void println() {
        System.out.println();
    }
    
    /**
     * Get the first element of a list
     */
    public static <T> T car(List<T> list) {
        return list.get(0);
    }
    
    /**
     * Get the rest of elements of a list except the first
     */
    public static <T> List<T> cdr(List<T> list) {
        return list.subList(1, list.size());
    }
}
