/****
 * Name: Tejas Mehta
 * Date: October 7th, 2019
 * Lab Name: LabP4.4-Two Numbers
 * Extra: Added the hypotenuse given the two numbers are two sides on a right triangle
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //Make class and init
        Pair p = new Pair(3, 4);
        //Print different values asked by labs and my extra of the hypotenuse
        System.out.println("The sum is " + p.getSum());
        System.out.println("The difference is " + p.getDiff());
        System.out.println("The product is " + p.getProduct());
        System.out.println("The average is " + p.getAvg());
        System.out.println("The distance is " + p.getDist());
        System.out.println("The max is " + p.getMax());
        System.out.println("The min is " + p.getMin());
        System.out.println("The Hypotenuse is " + p.getHypot());
    }
}
