package cyberManiacsTeamPractice;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if((number % 2) == 0){
            System.out.println(number +" is even");
        }else{
            System.out.println(number +" is odd");
        }


        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a + ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);





    }
}






