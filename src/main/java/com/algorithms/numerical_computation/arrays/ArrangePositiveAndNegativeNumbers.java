package com.algorithms.numerical_computation.arrays;

/**
 * Input: -5 -2 13 -8 1 -12  6 -5 -9 13
 * Output: -5 -2 -8 -12 -5 -9, 6 1 13 13
 * Put negative number on left and positive number on the right
 */
public class ArrangePositiveAndNegativeNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[] {-5, -2, 13, -8, 1, -12,  6, -5, -9, 13};
        arrangePosAndNegNumbers(numbers);
        System.out.println(" - ");
     //   arrangePosAndNegNumbers2(numbers);
        printArray(numbers);
    }

    private static void arrangePosAndNegNumbers(int[] numbers) {
        int j = 0, temp;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                if(i != j) {
                  temp = numbers[i];
                  numbers[i] = numbers[j];
                  numbers[j] =  temp;
                }
                j++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    static void arrangePosAndNegNumbers2(int numbers[]) {
        int key, j;
        for (int i = 1; i < numbers.length; i++) {
            key = numbers[i];

            if (key > 0) continue;

            j = i - 1;
            while (j >= 0 && numbers[j] > 0) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
