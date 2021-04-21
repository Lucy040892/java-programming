package day29_nestedloops_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int outer = 0; outer < word.length(); outer++) {
            System.out.println("Outer: " +word.charAt(outer));
            int count = 0;
            for (int iner = 0; iner < word.length(); iner++) {
                if (word.charAt(outer) == word.charAt(iner)) {
                    count++;
                }
            }
            System.out.println(word.charAt(outer) + "=" +count);

        }
    }
}