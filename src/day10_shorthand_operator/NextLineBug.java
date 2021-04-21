package day10_shorthand_operator;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine();//fix the bug.WORKAROUND
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);

        //next() vs nextLine()
        /*    next() -> read a String value from the console
        it only reads a single word -> spaces separate words
              nextLine() -> read a String value from the console
        it  will read multiple words -> Also accepts the enter input
         */

    }
}
