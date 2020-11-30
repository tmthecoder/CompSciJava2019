/****
 *
 */
package com.tejasmehta;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //New Scannner and Loop to keep going with conversions
        Scanner in = new Scanner(System.in);
        while (true) {
            //Base lists of the current bases available and conversions
            List<Integer> bases =  new LinkedList<Integer>(Arrays.asList(2, 10, 16));
            List<String> baseNames = new LinkedList<String>(Arrays.asList("Binary", "Decimal", "Hex", "BCD"));
            //Get User choice and get the number (conv to other base & validate)
            int choice = getStartingChoice(in);
            String userNumber = getNumber(in, bases.get(choice - 1));
            int userBase = bases.get(choice-1);
            //Remove user's selected base and show the others for their choice
            bases.remove(choice-1);
            baseNames.remove(choice-1);
            int convChoice = getConvChoice(in, baseNames);
            //Set special case for BCD
            if (convChoice == 3) {
                convChoice = 0;
            } else {
                convChoice = bases.get(convChoice-1);
            }
            //Make a new converter
            Converter conv = new Converter(userBase, convChoice, userNumber);
            //Convert and Print
            conv.convert();
            System.out.println(conv);

        }
    }
    //Method to get the nymber and validate it based on the user's selected base
    private static String getNumber(Scanner in, int base) {
        System.out.println("Enter the number to convert");
        String entry = in.nextLine();
        while (!validateEntry(in, base, entry)) {
            System.out.println("Please enter a valid number for the selected base:");
            entry = in.nextLine();
        }
        return entry;
    }
    //Method to validate any entry against the list of potential numbers (sublisted by the base selected)
    private static boolean validateEntry(Scanner in, int base, String number) {
        char[] validEntries = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        boolean valid = false;
        for(int i = 0; i < number.length(); i++) {
            for(int j = 0; j < base; j++) {
                if (validEntries[j] == number.charAt(i)) {
                    valid = true;
                    break;
                } else {
                    valid = false;
                }
            }
        }
        return valid;
    }
    //Method to get the user's starting choice and make sure it is a validated number (exit on any other entry)
    private static int getStartingChoice(Scanner in) {
        System.out.print("Enter the number of the starting base(or any other value to quit):\n" +
                "1. Binary\n" +
                "2. Decimal\n" +
                "3. Hex\n");
        String entry = in.nextLine();
        if (!entry.matches("[1-3]")){
            System.out.println("Exiting...");
            System.exit(0);
        }
        return Integer.parseInt(entry);
    }
    //Method to get the user's converting choice and make sure it is a validated number (exit on any other entry)
    private static int getConvChoice(Scanner in, List<String> leftBases) {
        System.out.println("Enter the number of the base to convert to:");
        StringBuilder remaining = new StringBuilder();
        for(int i = 0; i < leftBases.size(); i++) {
            remaining.append(i + 1).append(". ").append(leftBases.get(i)).append("\n");
        }
        System.out.print(remaining);
        String entry = in.nextLine();
        if (!entry.matches("[1-3]")){
            System.out.println("Exiting...");
            System.exit(0);
        }
        return Integer.parseInt(entry);
    }
}
