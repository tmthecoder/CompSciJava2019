/****
 * Name: Tejas Mehta
 * Date: September 9, 2019
 * Lab Name: RandomPartnerGenerator
 * Testing Requirements: Seen on requirements.txt
 * Known Bugs: None as of now
 */
package com.tejasmehta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Make the initial list
        List<String> modifiableList = new ArrayList<>(List.of("Admed, Adnan", "Campos, Marc", "Carlyon, Nathaniel", "Daptardar, Sanay", "Dasti, Joseph",
                "Dicang, Brandon", "Ecarma, Justin", "Gomes, Frank", "Hernandez, David", "Krupp, Ryan", "McDermid, Connor", "Mehta, Tejas", "Sarkhot, Rayyan",
                "Stulak, Brendan", "Tummalapalli, Poojit"));
        while (true) {
            RandomGenerator pairing = new RandomGenerator(modifiableList);
            //Make the pairing with a random and pair
            pairing.pair();
            //Sort the students
            pairing.sort();
            //Print the sorted pair
            System.out.println(pairing);
            System.out.println("Do you want to resort?");
            String sort = in.nextLine();
            //Re sort
            if (sort.toLowerCase().equals("y") || sort.toLowerCase().equals("yes")) {
                pairing.sort();
                System.out.println(pairing);
            }
            System.out.println("Do you want to generate another list?");
            String ans = in.nextLine();
            //Checker if they want another generation
            if(ans.toLowerCase().equals("n") || ans.toLowerCase().equals("no")) {
                System.exit(0);
            }
        }
    }
}
