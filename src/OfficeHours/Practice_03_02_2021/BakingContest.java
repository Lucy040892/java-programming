package OfficeHours.Practice_03_02_2021;
import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge " + judge++ + " score");
        int scoreOne = input.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreTwo = input.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreThree = input.nextInt();
        System.out.println("Enter other person 1's score");
        int otherPerson1 = input.nextInt();
        System.out.println("Enter other person 2's score");
        int otherPerson2 = input.nextInt();

        int ourAverageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        if (ourAverageScore > otherPerson1 && ourAverageScore > otherPerson2) {
            System.out.println("First place");
        } else if ((ourAverageScore > otherPerson1 && ourAverageScore < otherPerson2) || (ourAverageScore < otherPerson1 && ourAverageScore > otherPerson2)) {
            System.out.println("Second place");
        } else {
            System.out.println("Third place");
        }


    }

    }

