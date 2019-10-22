/****
 * Name: Tejas Mehta
 * Date: September 24th, 2019
 * Lab Name: BlackJackLab
 * Extra: Made the lab into the game of Blackjack
 */
package com.tejasmehta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackRunner {
    public static void main(String[] args) throws InterruptedException {
        //New scanner
        Scanner in = new Scanner(System.in);
        //Loop constantly to keep playing
        while (true) {
            //List of dealer's cards
            List<BlackJackCard> dealer = new ArrayList<>();
            //List of user's cards
            List<BlackJackCard> userCards = new ArrayList<>();
            //Intro
            System.out.println("Welcome to Blackjack.\nPlease insert a dollar into your USB port to Start!");
            Thread.sleep(5000);
            System.out.println("Okay! Time to Start!");
            //Add 2 cards, random
            userCards.add(new BlackJackCard());
            userCards.add(new BlackJackCard());
            dealer.add(new BlackJackCard());
            dealer.add(new BlackJackCard());
            //Print needed cards
            System.out.println("Your first card: \n" + userCards.get(0));
            System.out.println("Your Second Card: \n"+ userCards.get(1));
            System.out.println("The dealer's first card: \n" + dealer.get(0));
            //Player looper
            while (true) {
                //Print total value
                System.out.println("Your total value is: " + value(userCards));
                //Check if above 21 and show lost
                if (value(userCards) > 21) {
                    System.out.println("Sorry, You have lost! HAHA I WIN YOUR MONEY");
                    break;
                //Check if not equal to 21 and keep playing
                } else if (value(userCards) != 21) {
                    //Ask for hit or stay
                    System.out.println("Hit or Stay?(enter the word or h/s), defaults to stay");
                    String cardChoice = in.nextLine();
                    //Get choice and add a card if needed
                    if (cardChoice.toLowerCase().equals("h") || cardChoice.toLowerCase().equals("hit")) {
                        userCards.add(new BlackJackCard());
                        System.out.println("The Card Added was: " + userCards.get(userCards.size()-1));
                    } else {
                        //Since they didn't have 21, check what dealer had and proceed accordingly
                        if (value(userCards) > value(dealer)) {
                            System.out.println("I had: " + value(dealer) + ", You had: " + value(userCards) + "\nYou Win!");
                            break;
                        } else {
                            System.out.println("I had: " + value(dealer) + ", You had: " + value(userCards) + "\nYou Lose!");
                            break;
                        }
                    }
                //Last scenario, blackjack
                } else {
                    System.out.println("Good Job! You got blackjack! You Win!");
                    break;
                }
            }
            //Continuance message
            System.out.println("Would you like to keep playing?(defaults to yes)");
            String exiting = in.nextLine();
            if (exiting.toLowerCase().equals("n") || exiting.toLowerCase().equals("no")) {
                System.exit(0);
            }
        }
    }
    private static int value(List<BlackJackCard> cards) {
        int val = 0;
        for(BlackJackCard card: cards) {
            val += card.getValue();
        }
        return val;
    }
}
