/****
 * Made by Tejas Mehta
 * Made on Wednesday, February 05, 2020
 * File Name: Converter
 * Package: com.tejasmehta
 * Extra: None Needed
 */
package com.tejasmehta;

import java.util.*;

public class Converter {
    //Vars needed for use
    int base;
    int toBase;
    String userNum;
    String converted;
    //Constructor to get all needed values and set them
    Converter(int base, int toBase, String userNum) {
        setBase(base);
        setToBase(toBase);
        setUserNum(userNum);
    }
    //All 3 setters
    public void setBase(int base) {
        this.base = base;
    }
    public void setToBase(int toBase) {
        this.toBase = toBase;
    }
    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }
    //Method to perform the actual conversion delegation (calls other submethods based on what is needed)
    public void convert() {
        String converted;
        if (base == 10) {
            converted = convFromDecimal(toBase, userNum);
        } else if (toBase == 10) {
            converted = convToDecimal(base);
        } else if (toBase == 0) {
            converted = binHexBCD(convToDecimal(base));
        } else {
            converted = convFromDecimal(toBase, convToDecimal(base));
        }
        this.converted = converted;
    }
    //Method to make a BCD number from binary or hex with their given decimal translation
    private String binHexBCD(String decimalNum) {
        return makeBCD(decimalNum);
    }
    //Method to convert to any base from a decimal starting base
    private String convFromDecimal(int base, String userNum) {
        StringBuilder toReturn = new StringBuilder();
        if (base == 0) {
           toReturn.append(makeBCD(userNum));
        } else {
            toReturn.append(divideAndConv(Double.parseDouble(userNum), base));
        }
        return toReturn.toString();
    }
    //Method to make a BCD number from a given decimal number
    private String makeBCD(String userNum) {
        StringBuilder toReturn = new StringBuilder();
        //Account for decimals and do what is needed for them
        for (int i = 0; i < userNum.length(); i++) {
            if (userNum.charAt(i) == '.') {
                toReturn.replace(toReturn.length()-1, toReturn.length(), ".");
                continue;
            }
            toReturn.append(convToBcd(Double.parseDouble(String.valueOf(userNum.charAt(i))))).append(" ");
        }
        return toReturn.toString();
    }
    //Method to divide and convert a decimal num to a said base
    private String divideAndConv(double num, int base) {
        StringBuilder toReturn = new StringBuilder();
        //Do the numerical conversions (until the decimal)
        int newNum = (int) Math.floor(num);
        while (newNum != 0) {
            toReturn.insert(0, makeHexInt(newNum%base));
            newNum/=base;
        }
        int places = 0;
        double decimal = num-Math.floor(num);
        if (decimal != 0) {
            toReturn.append(".");
        }
        //Do the decimal conversions
        while (decimal != 0 && places < 5) {
            decimal *= base;
            toReturn.append((int)Math.floor(decimal));
            decimal -= Math.floor(decimal);
            places++;
        }
        return toReturn.toString();
    }
    //Method to convert any base to decimal
    private String convToDecimal(int base) {
        String[] decNormal;
        //Check if there is a decimal
        if (userNum.contains(".")) {
            decNormal = userNum.split("\\s*\\.\\s*");
        } else {
            decNormal = new String[]{userNum};
        }
        //Do the integer conversions(positive powers)
        double number = 0;
        for(int i = decNormal[0].length()-1; i >= 0; i--) {
            number += getIntHex(String.valueOf(decNormal[0].charAt(i))) * Math.pow(base, decNormal[0].length()-(i+1));
        }
        //Do the decimal part of the conversions (negative powers)
        if (decNormal.length >= 2) {
            for(int i = 0; i < decNormal[1].length(); i++) {
                double num = getIntHex(String.valueOf(decNormal[1].charAt(i)));
                double pow = Math.pow(base, -i-1);
                double newNum = num * pow;
                number += newNum;

            }
        }
        return String.valueOf(number);
    }
    //Method to convert any decimal number to its BCD equivalent (makes a map and returns the bcd for the decimal)
    private String convToBcd(double decimalNum) {
        Map<Double, String> bcdMap = new HashMap<>() {{
            put(0.0, "0000");
            put(1.0, "0001");
            put(2.0, "0010");
            put(3.0, "0011");
            put(4.0, "0100");
            put(5.0, "0101");
            put(6.0, "0110");
            put(7.0, "0111");
            put(8.0, "1000");
            put(9.0, "1001");
        }};
        return bcdMap.get(decimalNum);
    }
    //Method to get the numberical value for any number (mainly a check for hex-specific letters)
    private int getIntHex(String hexNum) {
        Map<String, Integer> hexToInt = new HashMap<>(){{
            put("A", 10);
            put("B", 11);
            put("C", 12);
            put("D", 13);
            put("E", 14);
            put("F", 15);
        }};
        //Return the number or hex converted 10s number
        int hexInt;
        if (hexToInt.get(hexNum.toUpperCase()) != null) {
            hexInt =hexToInt.get(hexNum.toUpperCase());
        } else {
            hexInt = Integer.parseInt(hexNum);
        }
        return hexInt;
    }
    //Method to make a hex number (convert numbers 10+ to their hex value)
    private String makeHexInt(int num) {
        Map<Integer, String> hexToInt = new HashMap<>(){{
            put(10, "A");
            put(11, "B");
            put(12, "C");
            put(13, "D");
            put(14, "E");
            put(15, "F");
        }};
        String hexInt;
        if (num > 9) {
            hexInt = hexToInt.get(num);
        } else {
            hexInt = String.valueOf(num);
        }
        return hexInt;
    }
    //toString method to print values
    @Override
    public String toString() {
        return "entered number: " + userNum +
                "\nconverted number: " + converted;
    }
}
