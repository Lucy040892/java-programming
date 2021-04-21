package day28_loops;

/**
 * Given a string retrieve and print only unique chars
 */

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";

        for(int i =0; i < word.length(); i++){
            System.out.println(word.charAt(i));
            // if word.charAt(i) is not contains in unique
            // add to unique
            if(!unique.contains(word.charAt(i) + "")){ //we converted to string by editing +""
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
