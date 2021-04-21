package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "Liudmyla";
        /**            01234567              */
        System.out.println(word.indexOf("y"));//5
        System.out.println(word.indexOf("a"));//7
        System.out.println(word.indexOf("myla"));//4
        System.out.println(word.indexOf("java"));// -1 means not found

    }
}
