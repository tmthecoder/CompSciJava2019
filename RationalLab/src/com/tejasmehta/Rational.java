/****
 * Name: Tejas Mehta
 * Date: September 20th, 2019
 * Lab Name: RationalLab
 * Extra: Same as on main
 */
package com.tejasmehta;

public class Rational {
    private int num;
    private int den;

    //Constructor
    Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    //Add fractions and reduce
    String add(Rational other) {
        //Multiply and add
        int answer = num*other.den + other.num*den;
        int newDen = other.den*den;
        return reduce(answer, newDen);
    }

    //Subtract fractions and reduce
    public String subtract(Rational other) {
        //Multiply and subtract
        int answer = num*other.den - other.num*den;
        int newDen = other.den*den;
        return reduce(answer, newDen);
    }

    //Set new rational
    void setRational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    //Check if fractions are equal
    boolean fracEqual(Rational other) {
        int num1, num2;
        //Multiply and check equality
        num1 = num * other.den;
        num2 = other.num * den;
        return num1 == num2;
    }

    //toString to print fractions
    @Override
    public String toString() {
        return num != 0 ? num + " / " + den : "0";
    }

    //Check which is bigger
    boolean isBigger(Rational other) {
        int num1, num2;
        //Multiply and check greater
        num1 = num * other.den;
        num2 = other.num * den;
        return num1 > num2;
    }

    //Gcm function
    private static long gcm(long a, long b) {
        //modulus(gcp calculation)
        return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
    }

    //Reduce a fraction
    private static String reduce(long a, long b) {
        //Get gcm
        long gcm = gcm(a, b);
        //return divided by gcm
        return (a / gcm) + " / " + (b / gcm);
    }

}
