/****
 * Name: Tejas Mehta
 * Date: September 26th, 2019
 * Lab Name: RockPaperScissors
 * Extra: Showed the win counters on the panel
 */
package com.tejasmehta;

public class Player {
    private String name;
    private String choice;

    public int getVal() {
        return val;
    }

    int val;

    public Player(String nm) {
        name = nm;
    }

    public Player(String nm, String ch) {
        setName(nm);
        setChoice(ch);
    }

    public void setName( String nm) {
        name = nm;
    }

    public void setChoice( String ch ) {
        if (ch.length() > 1) {
            choice = ch;
        } else {
            switch (ch) {
                case "r":
                    choice = "rock";
                    val = 0;
                    break;
                case "p":
                    choice = "paper";
                    val = 1;
                    break;
                case "s":
                    choice = "scissors";
                    val = 2;
                    break;
                default:
                    System.out.println("Illegal choice... Exiting");
                    System.exit(0);
            }
        }
    }

    public String getChoice() {
        return choice;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "";
    }
}