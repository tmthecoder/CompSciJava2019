/****
 * Name: Tejas Mehta
 * Date: September 24th,2019
 * Lab Name: CardLab
 * Extra: Random card getter
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //New cars
        Card one = new Card("SPADES", 9);
        //Print face and suit
        System.out.println(one.getSuit());
        System.out.println(one.getFace());

        //New cars, print, setFace
        Card two = new Card("DIAMONDS", 1);
        System.out.println(two);
        two.setFace(3);
        System.out.println(two);
        //New card and print
        Card three = new Card("CLUBS", 4);
        System.out.println(three);
        //New card and print
        Card four = new Card("SPADES", 12);
        System.out.println(four);
        //New card and print
        Card five = new Card("HEARTS", 12);
        System.out.println(five);
        //Print a random card
        System.out.println("Here is a random card: " + Card.random());
    }
}
