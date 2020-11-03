package com.algorithms.problems.listproblems;

import java.util.stream.DoubleStream;

public class AddTwoArrays {

    public static void main(String[] args) {
        double[] arr1 = {1.3, 2.4, 3.4};
        double[] arr2 = {3.4, 6.6, 33.4};

        double[] result = addTwoArraysApproach1(arr1, arr2);
        double[] result2 = addTwoArraysApproach2(arr1, arr2);
        double[] result3 = addTwoArraysApproach3(arr1, arr2);
        double[] result4 = addTwoArraysApproach3(arr1, arr2);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    /**
     * Add two arrays using built in method: arraycopy()
     * @param arr1
     * @param arr2
     * @return
     */
    private static double[] addTwoArraysApproach1(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    /**
     * Add two arrays using imperative loop
     * @param arr1
     * @param arr2
     * @return
     */
    private static double[] addTwoArraysApproach2(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];

        int pos = 0;
        for(double i : arr1) {
            result[pos] = i;
            pos++;
        }

        for(double i : arr2) {
            result[pos] = i;
            pos++;
        }
        return result;
    }

    /**
     * Add two arrays using streams
     * @param arr1
     * @param arr2
     * @return
     */
    private static double[] addTwoArraysApproach3(double[] arr1, double[] arr2) {
        return DoubleStream.concat(DoubleStream.of(arr1), DoubleStream.of(arr2)).toArray();
    }
}
