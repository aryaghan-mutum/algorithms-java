package com.assignments;

/**
 * @author anurag muthyam
 * url: https://github.com/aryaghan-mutum
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * THE PROGRAM CALCULATE THE USER'S OVERALL GRADE BASED ON
 * THEIR EXAM AND PROJECT SCORES AND FINALLY DIVIDE A PIZZA EQUALLY AMONG GROUPS OF DIFFERENT NUMBER OF PEOPLE
 */

public class CalculateGrades {

    private static int people, slices, leftover;
    private static double exam, exams, project, projects, examAverage, projectAverage, examResult, projectResult, overall;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the weight of the exams(e.g., 55 for 55%)=");
        exams = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the weight of the projects=");
        projects = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the exam average(e.g., 78 for 78%)=");
        examAverage = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter your project average:");
        projectAverage = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("#0.00");
        exam = exams / 100;
        examResult = (exam) * examAverage;
        project = projects / 100;
        projectResult = (project) * projectAverage;
        overall = examResult + projectResult;

        System.out.println("Overall average:" + df.format(overall));
        System.out.println("Enter the number of slices=");

        slices = Integer.parseInt(scanner.nextLine());
        people = slices / 3;
        leftover = slices - (people * 3);

        System.out.println("for three people,each person can have   " + people + "  slices with  " + leftover + "  leftover");
        people = slices / 4;
        leftover = slices - (people * 4);

        System.out.println("for four people,each person can have    " + people + "  slices with  " + leftover + "  leftover");
        people = slices / 5;
        leftover = slices - (people * 5);

        System.out.println("for five people,each person can have    " + people + "  slices with  " + leftover + "  leftover");
    }
}
