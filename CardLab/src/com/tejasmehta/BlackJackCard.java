/****
 * Name: Tejas Mehta
 * Date: September 24th, 2019
 * Lab Name: BlackJackLab
 * Extra:
 */
package com.tejasmehta;

public class BlackJackCard extends Card {
    public static final String[] FACES = {"ZERO","ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
    //All faces for card description
    private int value;
    private String type;
    //Random card constructor
    BlackJackCard() {
        super();
        setVal(getFace());
    }
    //Normal card constructor
    BlackJackCard(String suit, int face) {
        super(suit, face);
        setFace(face);
    }
    //get and return value
    public int getValue() {
        return value;
    }
    //Value setter, check for ace, and face cards
    private void setVal(int face) {
        switch (face) {
            case 1:
                value = 11;
                type = "ACE";
                break;
            case 11:
                value = 10;
                type = "JACK";
                break;
            case 12:
                value = 10;
                type = "QUEEN";
                break;
            case 13:
                value = 10;
                type = "KING";
                break;
            default:
                value = face;
                type = FACES[face];
        }
    }

    //toString to print cards
    @Override
    public String toString() {
        return type + " of " + getSuit() + "\nValue: " + value;
    }
}
