package com.assignments;

/**
 * @author anurag muthyam
 * url: https://github.com/aryaghan-mutum
 */

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * The program decides the average salary a person receives based on his education level
 */
public class CalculateAvgSalary {

    private static int one = 25705, two = 35035, three = 55864, four = 68879, five = 91492, choice;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        print();
        salaryInfo();
    }

    private static void print() {
        System.out.println("    1 = No Degree");
        System.out.println("    2 = High School Degree");
        System.out.println("    3 = Bachelor Degree");
        System.out.println("    4 = Master Degree");
        System.out.println("    5 = Doctorate Degree");
        System.out.println("");
        System.out.print("Enter the number that corresponds to your degree:");
    }

    public static void salaryInfo() {
        NumberFormat nf = NumberFormat.getInstance();
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Based on 2010 U.S. Census Bureau, PINC-03,Table 28, with your education level...");
                System.out.println("Average Salary is :$" + nf.format((one)));
                break;
            case 2:
                System.out.println("Based on 2010 U.S. Census Bureau, PINC-03,Table 28, with your education level...");
                System.out.println("Average Salary is :$" + nf.format((two)));
                break;
            case 3:
                System.out.println("Based on 2010 U.S. Census Bureau, PINC-03,Table 28, with your education level...");
                System.out.println("Average Salary is :$" + nf.format((three)));
                break;
            case 4:
                System.out.println("Based on 2010 U.S. Census Bureau, PINC-03,Table 28, with your education level...");
                System.out.println("Average Salary is :$" + nf.format((four)));
                break;
            case 5:
                System.out.println("Based on 2010 U.S. Census Bureau, PINC-03,Table 28, with your education level...");
                System.out.println("Average Salary is :$" + nf.format((five)));
                break;
            default:
                System.out.println("You entered an invalid menu choice.");
                System.out.println("Please re-run the program and enter in a valid choice.");
        }
    }

}
