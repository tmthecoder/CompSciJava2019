package com.tejasmehta;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Card {
    //Instance vars
    private String suit;
    private int face;
    public static final String[] FACES = {"DIAMONDS","HEARTS","SPADES","CLUBS"};
    //Static map
    private static Map<String, Integer> cards = new HashMap<>();
    Card() {
        Random r = new Random();
        this.face = r.nextInt(13) + 1;
        this.suit = FACES[r.nextInt(FACES.length)];
        cards.put(suit, face);
    }
    //Constructor, set suit and face and put in map
    Card(String suit, int face) {
        this.face = face;
        this.suit = suit;
        cards.put(suit, face);
    }
    //Get face
    int getFace() {
        return face;
    }
    //Get and return suit
    String getSuit() {
        return suit;
    }
    //Face setter
    void setFace(int face) {
        this.face = face;
    }
    //toString
    @Override
    public String toString() {
        return "Suit: " + suit + " Face: " + face;
    }
    //Random methpd
    static String random() {
        Random rand = new Random();
        //new random, get card suit
        String card = cards.keySet().toArray()[rand.nextInt(cards.size())].toString();
        //Get val with suit
        int value = cards.get(card);
        //return card string
        return new Card(card, value).toString();
    }
}
