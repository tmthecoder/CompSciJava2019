/****
 * Name: Tejas Mehta
 * Date: September 16, 2019
 * Lab Name: EmployeeLab
 * Extra: Added a decrease salary option
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner and init employee declaraton
        Employee employee = new Employee("Tejas", 100000);
        System.out.println("Would you like to raise or decrease the user's salary?(r/d)");
        String inDec = in.nextLine();
        System.out.println("By how many percent?");
        int percent = in.nextInt();
        //Ask increasing/decreasing and the percent and then perform the action
        if (inDec.equalsIgnoreCase("d") || inDec.equalsIgnoreCase("decrease")) {
            employee.decreaseSalary((double)percent/100);
        } else {
            employee.raiseSalary((double)percent/100);
        }
        //Print employee and new salary
        System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.returnSalary());
    }
}
