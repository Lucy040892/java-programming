package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = scan.nextDouble();
        double kilometres = miles * 1.609;
        System.out.println("It is " +kilometres +"km");



    }
}
