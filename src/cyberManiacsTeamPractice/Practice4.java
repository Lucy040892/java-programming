package cyberManiacsTeamPractice;
import java.util.*;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        for(int i=0; i < count; i++){
            if(i==count-1){
                System.out.print(word);
            }else{
                System.out.print(word + separator);
            }
        }



    }

}
