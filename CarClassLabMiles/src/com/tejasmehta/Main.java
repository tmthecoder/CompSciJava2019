/****
 * Name: Tejas Mehta
 * Date: September 16th, 2019
 * Lab Name: CarClassLabMiles
 * Extra: Added Tire Rotations
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //Declare class
        Car c = new Car(9000, 3000, 5000);
        //Check which is needed
        System.out.println( c.timeForOilChange());
        System.out.println( c.timeForTireRotation());
        //Add miles
        c.addMiles(2000);
        //Check which is needed
        System.out.println( c.timeForOilChange());
        System.out.println( c.timeForTireRotation());
        //Add miles
        c.addMiles(2000);
        //Check which is needed
        System.out.println( c.timeForOilChange());
        System.out.println( c.timeForTireRotation());
    }
}
