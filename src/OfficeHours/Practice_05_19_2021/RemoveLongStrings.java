package OfficeHours.Practice_05_19_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(removeLongStrings(list, 4));
        System.out.println(removeLongStrings2(list, 5));
    }
    public static ArrayList<String> removeLongStrings(ArrayList<String> list, int minLength) {
        ArrayList<String> validStrings = new ArrayList<>();
        for(String word : list) {
            if(word.length() >= minLength) {
                validStrings.add(word);
            }
        }
        return validStrings;

    }
    public static ArrayList<String> removeLongStrings2(ArrayList<String> list, int minLength) {
        list.removeIf(each -> each.length() < minLength);
        return list;
    }
}
