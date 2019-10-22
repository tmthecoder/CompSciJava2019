/****
 * Name: Tejas Mehta
 * Date: September 20th, 2019
 * Lab Name: RationalLab
 * Extra: Added fraction subtraction
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //Init args
        Rational rOne = new Rational(1,2);
        Rational rTwo = new Rational(2,3);
        //Print both
        System.out.println("rOne = "+rOne);
        System.out.println("rTwo = "+rTwo);
        //Check one as bigger
        System.out.println( "1/2 > 2/3 == " + rOne.isBigger(rTwo) );
        //Add
        System.out.println(rOne + " + " + rTwo + " = " + rOne.add(rTwo));
        //New Settings
        rOne.setRational(1,2);
        rTwo.setRational(1,3);
        //check which is bigger
        System.out.println( "1/2 > 1/3 == " + rOne.isBigger(rTwo) );
        //Add
        System.out.println(rOne + " + " + rTwo + " = "+ rOne.add(rTwo));
        //New Fractions
        rOne.setRational(4,10);
        rTwo.setRational(3,5);
        //Add
        System.out.println(rOne + " + " + rTwo+ " = "+ rOne.add(rTwo));
        //new Fractions
        rOne.setRational(2,10);
        rTwo.setRational(3,6);
        //Add
        System.out.println(rOne + " + " + rTwo + " = "+ rOne.add(rTwo));
        //New Fractions
        rOne.setRational(1,4);
        rTwo.setRational(2,8);
        //Add and subtract
        System.out.println(rOne + " + " + rTwo + " = " + rOne.add(rTwo));
        System.out.println(rOne + " - " + rTwo + " = " + rOne.subtract(rTwo));
        //New Fractions
        rOne.setRational(1,6);
        rTwo.setRational(2,8);
        //Add
        System.out.println(rOne + " + " + rTwo + " = " + rOne.add(rTwo));
        //New Fraction
        rOne.setRational(1,2);
        rTwo.setRational(2,4);
        //Check equality
        System.out.println( "1/2 == 2/4 is " + rOne.fracEqual(rTwo) );
    }
}
