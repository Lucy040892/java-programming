package OfficeHours.Practice_07_19_2021;

import java.util.*;

public class SortEachPart {
    /*
    Create a method that will take any String of letters and numbers and sort each substring of numbers and letters

    Ex:
    Input: "DC501GCCCA098911"
    Output: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        System.out.println(sortEach("DC501GCCCA098911"));
    }
    public static String sortEach(String str) {
        String fixedStr = "";
        ArrayList<String> eachSub = new ArrayList<>();

        //Queue<String> eachSub = new PriorityQueue<>();

        //"DC501GCCCA098911"
        //eachSub =
        //fixed = CD

        for(int i=0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            eachSub.add("" +eachChar);
            boolean nextSubstring = false;

            if(Character.isLetter(eachChar)) {
                //we are a character
                if(i == str.length() -1 || !Character.isLetter(str.charAt(i+1))) {
                    // next char is a number, do an action
                    nextSubstring = true;
                }

            }else{
                //we are a number
                if(i == str.length() -1 || !Character.isDigit(str.charAt(i+1))) {
                    //next is letter, do an action
                    nextSubstring = true;

                }
            }
           // this is the action
            if(nextSubstring) {
                Collections.sort(eachSub);
                fixedStr += String.join("", eachSub);
                eachSub.clear();

                //with Queue as eachSub, you don't need this line: Collections.sort(eachSub)
            }
        }
        return fixedStr;


    }
}
