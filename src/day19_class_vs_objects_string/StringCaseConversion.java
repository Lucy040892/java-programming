package day19_class_vs_objects_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java IS Fun ";
        System.out.println(word);
        //convert word to all lowercase
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase  = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        //change word to all lowercase letters, and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);




        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company Amazon to AMAZON
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);





    }
}
