package com.algorithms.strings;

import java.util.Arrays;

public class MyStringBuilder {

    public static void main(String[] args) {
        int[] data = {1, 4, 5, 0, 3};
        System.out.println(max2(data));

    }

    private static int max(int[] data) {
        return Arrays.stream(data).max().getAsInt();
    }

    private static int max2(int[] data) {
        return Arrays.stream(data).sorted().sum();
    }


}
