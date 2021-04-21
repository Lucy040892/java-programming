package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'g';
        int index = -1;
        for(int n = 0; n < word.length(); n++ ){
            //System.out.println(n +" - " +word.charAt(n));
            if(word.charAt(n) == letter){
                index = n;
                System.out.println(letter +" is found at index " +index);
                break; //exit for loop, (return means exit main method)
            }
        }
            if(index == -1){
                System.out.println(letter +" is not present");

            }




    }
}
