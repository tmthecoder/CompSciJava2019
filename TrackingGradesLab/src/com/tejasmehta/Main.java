/****
 * Name: Tejas Mehta
 * Date: September 10, 2019
 * Lab Name: TrackingGradesLab
 * Extra: Allowed the user to enter an unlimited amount of tests
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Declare scanner and ask for both names
        System.out.println("Enter the first Student's name:");
        String stu1Name = in.nextLine();
        System.out.println("Enter the second Student's name");
        String stu2Name = in.nextLine();
        //Create students
        Student stu1 = new Student(stu1Name);
        Student stu2 = new Student(stu2Name);
        //Start input method
        stu1.inputGrades();
        stu2.inputGrades();
        //Print students
        System.out.println("1: " + stu1);
        System.out.println("2: " + stu2);
    }
}
