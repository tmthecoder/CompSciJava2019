/****
 * Name: Tejas Mehta
 * Date: September 6, 2019
 * Lab Name: CarClassLab
 * Extra: On Main
 */
package com.tejasmehta;

public class Car {
    //Private init vars
    private int mpg;
    private int gasStart;
    private int gasLeft;
    //Constructor to start with miles
    public Car(int miles) {
        mpg = miles;
    }
    //Fill amount of gas
    void fillGas(int gallons) {
        gasStart = gallons;
        gasLeft = gallons;
    }
    //Drive said amount and calculate how many gallons left
    void drive(int miles) {
        int gallonsUsed = miles / mpg;
        gasLeft = gasStart - gallonsUsed;

    }
    //Return the amount of gallons left
    int getGasGallons() {
        return gasLeft;
    }
}
