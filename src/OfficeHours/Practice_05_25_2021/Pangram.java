package OfficeHours.Practice_05_25_2021;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        //pangram is a String that contains all of the letters in the alphabet
        //for example
        String s = "A quick brown fox jumps over the lazy dog";
        char[] a = s.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(isPangram(s));
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        //we can create alphabet String
        // String alp = "";
        //for(int i = 'a'; i <= 'z'; i++) {
        //   System.out.print((char)i);
        //}
        //return false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                alp = alp.replace("" + str.charAt(i), "");
                System.out.println(str.charAt(i) + " " + alp);

            }
            if (alp.isEmpty()) {
                break;
            }
        }
            return alp.isEmpty();
        }
    }

