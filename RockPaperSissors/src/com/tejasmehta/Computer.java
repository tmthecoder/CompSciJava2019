/****
 * Name: Tejas Mehta
 * Date: September 26th, 2019
 * Lab Name: RockPaperScissors
 * Extra: Showed the win counters on the panel
 */
package com.tejasmehta;

import java.util.Random;

public class Computer {
    //instance / member variables
    private String choice;
    int val;

    //Constructor
    public Computer() {
        randomSetChoice();
    }

    //get the choice
    public String getChoice() {
        return choice;
    }

    //Set a random choice
    public void randomSetChoice() {
        //new random
        Random rand = new Random();
        int choice = rand.nextInt(3);
        val = choice;
        switch (choice) {
            //Set based on random number
            case 0:
                this.choice = "rock";
            case 1:
                this.choice = "paper";
            default:
                this.choice = "scissors";
        }
    }

    public int didIWin(Player p) {
        int pVal = p.getVal();
        int win = 0;
        if (pVal == val) {
            win = 0;
        } else if (val > pVal) {
            if (pVal == 0 && val == 2) {
                win = -1;
            } else {
                win = 1;
            }
        } else {
            if (val == 0 && pVal ==2) {
                win = 1;
            } else {
                win = -1;
            }
        }
        return win;
    }

    public String toString() {
        return "";
    }
}