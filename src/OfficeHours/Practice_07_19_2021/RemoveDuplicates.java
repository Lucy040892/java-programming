package OfficeHours.Practice_07_19_2021;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
    Ex: Input: "AAABBBCCCD"
        output: "ABCD"
        1) usually I use Set<>, it does not allow duplicates
        2) loop through each char I will compare with each other char in the String
     */

    public static String removeDuplicateChars (String str) {
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        //return set.toString().replace("[", "").replace("]", "").replace(", ", "");
        return String.join("", set);
        //We can use LinkedHashSet<String>() if we need result in natural order
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("AAABBBCCCD"));

    }
}
