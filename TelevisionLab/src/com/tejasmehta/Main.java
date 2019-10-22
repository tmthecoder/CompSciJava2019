/****
 * Name: Tejas Mehta
 * Date: Septemeber 12, 2019
 * Lab Name: TelevisionLab
 * Extra: Added a volume decrement/increment setter to ask how much to lower/increase the volume by
 */
package com.tejasmehta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Television tv = new Television("Toshiba", 55);
        tv.power();
        System.out.println("A " + tv.getScreenSize() + " in " + tv.getManufacturer() + " has been turned on.");
        System.out.println("What channel do you want?");
        tv.setChannel(in.nextInt());
        System.out.println("Channel: " + tv.getChannel() + " | Volume: " + tv.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        tv.decreaseVolume(5);
        Television newTv = new Television("Sharp", 19);
        newTv.power();
        System.out.println("A " + newTv.getScreenSize() + " in " + newTv.getManufacturer() + " has been turned on.");
        System.out.println("What channel do you want?");
        newTv.setChannel(in.nextInt());
        System.out.println("Channel: " + newTv.getChannel() + " | Volume: " + newTv.getVolume());
        System.out.println("Lower/Increase the volume?(- for lower, + for increase");
        in.nextLine();
        String highLow = in.nextLine();
        System.out.println("By how much?");
        int amount = in.nextInt();
        if (highLow.contains("+")) {
            newTv.increaseVolume(amount);
        } else {
            newTv.decreaseVolume(amount);
        }
        System.out.println("Channel: " + newTv.getChannel() + " | Volume: " + newTv.getVolume());
    }
}
