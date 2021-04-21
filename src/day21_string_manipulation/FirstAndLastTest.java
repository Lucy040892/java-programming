package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last){
            System.out.println("First and last are the same letters.");
        }else{
            System.out.println("Letters mismatch");
        }

        String friend = "Lucy";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() - 1);
        //int count = friend.length()
        //char lastLetter = friend.charAt(count-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if(firstLetter == lastLetter){
            System.out.println(friend +" - first and last letters match");
        }else{
            System.out.println(friend +" - first and last letters do not match");
        }



    }
}
