package com.algorithms.problems.stringproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Anurag Muthyam
 * <p>
 * How do you verify a given phone number is Valid?
 * 1st Case: (nnn) nnn-nn-nn
 * 2nd Case: nnnnnnnnnn
 */
public class CheckPhoneNumberIsValid {

    /**
     * Check a phone number is valid
     *
     * @param number
     * @return
     */
    public static boolean isPhoneNumValidCase1(String number) {
        long count = number.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .count();

        if (count != 10) return false;

        return true;
    }

    /**
     * Check a phone number has 10 digits
     *
     * @param number
     * @return
     */
    public static boolean isPhoneNumHas10Digits(String number) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches() ? true : false;
    }

    /**
     * Check a phone number has dots or hyphen
     *
     * @param number
     * @return
     */
    public static boolean isPhoneNumHasDotsOrHyphen(String number) {
        Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches() ? true : false;
    }

    /**
     * Check a phone number has parenthesis
     *
     * @param number
     * @return
     */
    public static boolean isPhoneNumHasParen(String number) {
        Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches() ? true : false;
    }
}
