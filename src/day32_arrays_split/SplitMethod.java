package day32_arrays_split;
import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        //               0     1      2       3
        String words = "java,python,selenium,html";
        words.split(",");
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array "+wordsArray.length);

        for( String each : wordsArray){
            System.out.println(each);

        }

        String sentence = "today I am coding java arrays";
        sentence.split(" ");
        String[] sentenceArray = sentence.split(" ");
        System.out.println(sentenceArray[0]);
        System.out.println("First word: " +sentence.split(" ")[0]);
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("Number of words in the sentence: " +sentenceArray.length);
        for(String each : sentenceArray){
            System.out.println(each);
        }


        String cats = "bengal cat tabby cat persian cat no cat here";



    }
}
