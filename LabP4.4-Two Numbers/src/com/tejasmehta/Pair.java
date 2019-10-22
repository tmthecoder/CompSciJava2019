/****
 * Name: Tejas Mehta
 * Date: October 7th, 2019
 * Lab Name: LabP4.4-Two Numbers
 * Extra: Added the hypotenuse given the two numbers are two sides on a right triangle
 */
package com.tejasmehta;

class Pair {
    //instance vars
    private double num1;
    private double num2;

    //Constructor
    Pair(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //sum returner
    double getSum() {
        return num1 + num2;
    }
    //difference returner
    double getDiff() {
        return num1 - num2;
    }
    //product and return rounded to 2 decimals
    double getProduct() {
        return Math.round(num1 * num2*100.0)/100.0;
    }
    //Average get and return
    double getAvg() {
        return (num1+num2)/2;
    }
    //Get the absolute value and return
    double getDist() {
        return Math.abs(num1-num2);
    }
    //Get the max and return
    double getMax() {
        return Math.max(num1, num2);
    }
    //Get the minimum and return
    double getMin() {
        return Math.min(num1, num2);
    }
    //Get the hypotenuse and return rounded to 3 decimals
    double getHypot() {
        return Math.round(Math.hypot(num1, num2)*1000.0)/1000.0;
    }
}
