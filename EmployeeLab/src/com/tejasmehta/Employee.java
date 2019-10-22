/****
 * Name: Tejas Mehta
 * Date: September 16, 2019
 * Lab Name: EmployeeLab
 * Extra: Added a decrease salary option
 */
package com.tejasmehta;

import java.text.DecimalFormat;

public class Employee {
    //Private vars
    private String name;
    private double salary;
    //Constructor(get and set values)
    Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    //Get and return name
    String getName() {
        return name;
    }
    //Get and return salary
    String returnSalary() {
        DecimalFormat format = new DecimalFormat("##.00");
        return format.format(salary);
    }
    //method to raise salary by x percent
    void raiseSalary(double percent) {
        DecimalFormat format = new DecimalFormat("##.00");
        salary = salary*(percent+1);
    }
    //method to decrease salary by x percent
    void decreaseSalary(double percent) {
        salary = salary * (1 - percent);
    }
}
