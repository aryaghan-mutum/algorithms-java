package com.algorithms.problems.listproblems;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Anurag Muthyam
 * <p>
 * How do you verify a given phone number is Valid?
 * 1st Case: (nnn) nnn-nn-nn
 * 2nd Case: nnnnnnnnnn
 */
public class CheckPhoneNumberIsValid {

    public static void main(String[] args) {
        // 2nd case:
        System.out.println(isPhoneNumValidCase1("7857053308"));

        System.out.println(isPhoneNumHas10Digits("2055550125"));
        System.out.println(isPhoneNumHasDotsOrHyphen("202 555 0125"));
        System.out.println(isPhoneNumHasParen("(202) 555-0125"));
    }

    public static boolean isPhoneNumValidCase1(String number) {
        List<Object> list = number.chars()
                .mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.toList());

        long count = list.stream().count();
        if (count != 10) {
            System.out.println("InValid phone number");
            return false;
        }

        System.out.println("Valid phone number");
        return true;
    }

    public static boolean isPhoneNumHas10Digits(String number) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid phone number");
            return true;
        } else {
            System.out.println("InValid phone number");
            return true;
        }
    }

    public static boolean isPhoneNumHasDotsOrHyphen(String number) {
        Pattern pattern = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid phone number");
            return true;
        } else {
            System.out.println("InValid phone number");
            return true;
        }
    }

    public static boolean isPhoneNumHasParen(String number) {
        Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            System.out.println("Valid phone number");
            return true;
        } else {
            System.out.println("InValid phone number");
            return true;
        }
    }
}
