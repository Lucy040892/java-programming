package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;
        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong, you number is oo large");
            }else if(guessingNumber < secretNumber){
                System.out.println("Wrong, your number is too small");
            }
        }while(guessingNumber != secretNumber);
        System.out.println("Congratulations, you won! secret number: " +secretNumber);

    }
}
