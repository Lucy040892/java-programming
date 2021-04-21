package day33_arrays;
import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajava";
        String[] array = word.split("a");
        System.out.println(array.length); //2
        int countOfA = array.length-1;
        if(word.endsWith("a")){ //if ends with A count 1 more
            countOfA++;
        }
        System.out.println("count of A = " +countOfA);

        System.out.println("-------SPLIT WITH EMPTY STRING-----------");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);



        String word2 = "java1sql2html";
        String[] strArray2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArray2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " +word2);

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }
}
