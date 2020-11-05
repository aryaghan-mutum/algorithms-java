package com.assignments;

/**
 * @author anurag muthyam
 * url: https://github.com/aryaghan-mutum
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * The program decides the average salary a person receives based on his education level
 */
public class CalculateAvgSalary2 {

    private static double one = 25.00, two = 19.25, three = 9.50, four = 5.00;
    private static int num, choice;

    public static void main(String[] args) {
        print();
        averageSalary();
    }

    private static void print() {
        System.out.println("    1 = Next Day Air (Cost $25.00)");
        System.out.println("    2 = Business Two Day (Cost $19.25)");
        System.out.println("    3 = UPS Priority (Cost $9.50)");
        System.out.println("    4 = US Postal Ground (Cost $5.00)");
        System.out.println("");
        System.out.print("Enter 1, 2, 3, or 4 for delivery method:");
    }

    static void averageSalary() {
        Scanner s = new Scanner(System.in);
        choice = Integer.parseInt(s.nextLine());
        System.out.println("");
        DecimalFormat df = new DecimalFormat("0.00");

        switch (choice) {
            case 1:
                System.out.print("Please enter the number of packages you wish to ship using this method:");
                num = Integer.parseInt(s.nextLine());
                System.out.println("Total cost to ship " + num + " package<s> Next Day Air is $" + df.format(one * num));
                break;
            case 2:
                System.out.print("Please enter the number of packages you wish to ship using this method:");
                num = Integer.parseInt(s.nextLine());
                System.out.println("Total cost to ship " + num + " package<s> Next Day Air is $" + df.format(two * num));
                break;
            case 3:
                System.out.print("Please enter the number of packages you wish to ship using this method:");
                num = Integer.parseInt(s.nextLine());
                System.out.println("Total cost to ship " + num + " package<s> Next Day Air is $" + df.format(three * num));
                break;
            case 4:
                System.out.print("Please enter the number of packages you wish to ship using this method:");
                num = Integer.parseInt(s.nextLine());
                System.out.println("Total cost to ship " + num + " package<s> Next Day Air is $" + df.format(four * num));
                break;
            default:
                System.out.println("You entered an invalid menu choice.");
                System.out.println("Please re-run the program and enter in a valid choice.");
        }
    }

}
