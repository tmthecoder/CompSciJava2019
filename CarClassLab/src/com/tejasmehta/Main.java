/****
 * Name: Tejas Mehta
 * Date: September 6, 2019
 * Lab Name: CarClassLab
 * Extra: Scanner to have a user enter values
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Make scanner & ask for miles per gallon
        System.out.println("Enter the amount of miles per gallon");
        int mpg = in.nextInt();
        //Set the miles per gallon
        Car car = new Car(mpg);
        //Ask for the gallon count
        System.out.println("Enter how many gallons of gas you want to fill");
        int gas = in.nextInt();
        //Fill that amount of gas
        car.fillGas(gas);
        //Ask for the amount of miles
        System.out.println("How many miles do you want to drive?");
        int miles = in.nextInt();
        //Drive inputted miles
        car.drive(miles);
        //Print gallons left
        System.out.println("There are " + car.getGasGallons() + " gallons left to use");
    }
}
