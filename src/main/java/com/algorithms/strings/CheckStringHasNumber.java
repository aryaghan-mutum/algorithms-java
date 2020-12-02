package com.algorithms.strings;

import java.util.regex.Pattern;

public class CheckStringHasNumber {

    public static boolean doesStringHasNumber(String str) {
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        return !pattern.matcher(str).matches();
    }
}
