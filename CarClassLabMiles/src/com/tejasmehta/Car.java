/****
 * Name: Tejas Mehta
 * Date: September 16th, 2019
 * Lab Name: CarClassLabMiles
 * Extra: Added Tire Rotations
 */

package com.tejasmehta;

public class Car {
    //Private tracker variables
    private int oilChangeNum;
    private int tireChangeNum;
    private int milesOilChange;
    private int milesTireRotate;
    //Inital constructor to set changing miles and miles driven
    public Car(int mD, int mC, int mT) {
        oilChangeNum = mC;
        milesOilChange = mD;
        milesTireRotate = mD;
        tireChangeNum = mT;
    }
    //Method to add miles
    public void addMiles (int toAdd) {
        milesOilChange+=toAdd;
        milesTireRotate+=toAdd;
    }
    //Check for an oil change method
    public String timeForOilChange() {
        int oldMiles = milesOilChange;
        //Reset if change needed
        if (oldMiles > oilChangeNum) {
            milesOilChange = 0;
        }
        return oldMiles > oilChangeNum ? "Time for an oil change" : "No oil change needed";
    }
    //Check for a tire rotation method
    public String timeForTireRotation() {
        int oldMiles = milesTireRotate;
        //Reset if rotation needed
        if (oldMiles > tireChangeNum) {
            milesTireRotate = 0;
        }
        return oldMiles > tireChangeNum ? "Time for a tire rotation" : "No tire rotation needed";
    }
}
