/****
 * Name: Tejas Mehta
 * Date: September 9, 2019
 * Lab Name: RandomPartnerGenerator
 * Testing Requirements: On Unit Test File
 * Known Bugs: None as of now
 */
package com.tejasmehta;

import java.util.*;

public class RandomGenerator {
    //Initial vars, map,list and out string
    private List<String> students;
    private Map<String, String> paired;
    private StringBuilder out = new StringBuilder().append(String.format("%-30.30s  %-30.30s%n", "Coders:", "Testers:"));
    //Constructor to get students
    RandomGenerator(List s) {
        students = s;
    }
    //Paiting method
    void pair() {
        paired = new HashMap<>();
        Random random = new Random();
        Collections.shuffle(students, new Random());
        //Filter out if odd, then do a round robin for the first 3
        if (students.size() % 2 != 0) {
            paired.put(students.get(0), students.get(1));
            paired.put(students.get(1), students.get(2));
            paired.put(students.get(2), students.get(0));
            students.remove(0);
            students.remove(0);
            students.remove(0);
        }
        //Make 2 sublists to avoid multiple pairings for one person
        List<String> coders = students.subList(0, students.size()/2);
        List<String> testers = students.subList(students.size()/2, students.size());
        //Shuffle both
        Collections.shuffle(coders);
        Collections.shuffle(testers);
        for(int i = 0; i < coders.size(); i++) {
            //Put it into the final map
            paired.put(coders.get(i), testers.get(i));
            paired.put(testers.get(i), coders.get(i));
        }
    }
    //Sorting method
    void sort() {
        Scanner in = new Scanner(System.in);
        System.out.println("Names sorted by coder or tester? (Defaults to coder)");
        //Ask for sorting and call the sorter with their preference
        String sortWay = in.nextLine();
        boolean coder = true;
        if (sortWay.toLowerCase().equals("tester")) {
            coder = false;
        }
        //Check if they want it sorted via coder or tester
        if (coder) {
            //Make a treemap, which is sorted by default and get from that
            Map<String, String> treeMap = new TreeMap<>(paired);
            for (int i = 0; i < treeMap.keySet().size(); i++) {
                //format and add to out string
                String toAppend = String.format("%-30.30s  %-30.30s%n", treeMap.keySet().toArray()[i],treeMap.values().toArray()[i]);
                out.append(toAppend);
            }
        } else {
            //Mape anoher map based on the sorted method below
            Map<String, String> sorted = sortByValue(paired);
            for(int i = 0; i < sorted.keySet().size(); i++) {
                //format and add to out string
                String toAppend = String.format("%-30.30s  %-30.30s%n", sorted.keySet().toArray()[i],sorted.values().toArray()[i]);
                out.append(toAppend);
            }
        }
    }
    //Method to sort map by values(tester in this case)
    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        //Make a new arraylist
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        //compare the list by val
        list.sort(Map.Entry.comparingByValue());
        //make a linkedhashmap and add the value from list
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    //toString to print out
    @Override
    public String toString() {
        return String.valueOf(out);
    }
}
