/****
 * Name: Tejas Mehta
 * Date: September 10, 2019
 * Lab Name: TrackingGradesLab
 * Extra: Allowed the user to enter an unlimited amount of tests
 */
package com.tejasmehta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    //Private vars
    private String name;
    private List<Integer> tests;
    private double average;

    //constructor
    Student(String stuName) {
        name = stuName;
    }
    void inputGrades() {
        //Create the tests array
        tests = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //While they keep answering keep asking for tests
        while (true) {
            System.out.println("Enter a test value for " + name + ":");
            tests.add(in.nextInt());
            System.out.println("Do you want to enter another score?");
            in.nextLine();
            String resp = in.nextLine();
            if (resp.equals("n") || resp.equals("no")) {
                break;
            }
        }
    }
    //Print their name
    void printName() {
        System.out.println(name);
    }
    //Get their average
    void getAverage() {
        int count = 0;
        int grade = 0;
        //Loop to count and avg
        for(int i = 0; i < tests.size(); i++) {
            grade += tests.get(i);
            count++;
        }
        average = (double)grade/count;
    }

    @Override
    public String toString() {
        //get avg if not done already
        getAverage();
        //Build the string of all tests and return the final string
        StringBuilder test = new StringBuilder("Test Scores: \n");
        for(int i = 0; i < tests.size(); i++) {
            test.append("\tTest ").append(i+1).append(": ").append(tests.get(i)).append("\n");
        }
        return "Student: " + name + "\nAverage: " + average + "\n" + test;
    }
}
