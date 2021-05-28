package cyberManiacsTeamPractice;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println(num1 + " divide by " + num2);


        if (num2 == 0) {
            System.out.println("invalid entry");
            return;
        }

        if (num2 > num1) {
            System.out.println("invalid entry");
            return;
        }
        int count = 0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }


            System.out.println(count + " remainder is " +num1);


    }
}