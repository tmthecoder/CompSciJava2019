/****
 * Name: Tejas Mehta
 * Date: September 26th, 2019
 * Lab Name: RockPaperScissors
 * Extra: Showed the win counters on the panel
 */
package com.tejasmehta;

public class ComputerTest {
    public static void main(String[] args) {
        //instantiate a new Computer named c
         Computer c = new Computer();
        //call and print out getChoice()				//outs random choice
        System.out.println(c);								//outs pooter random choice

        //call randomChoice
        System.out.println(c);								//outs pooter random choice

        //this code will test didIWin( Player p )
        System.out.println(c.didIWin(new Player("dude","rock")));
        System.out.println(c.didIWin(new Player("dude","paper")));
        System.out.println(c.didIWin(new Player("dude","scissors")));
    }
}
