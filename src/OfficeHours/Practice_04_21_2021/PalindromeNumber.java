package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        //System.out.println(112 % 1); // 112
        //System.out.println(112 % 10); // 2   % 10 always gives last number
        //System.out.println(112 % 100); //12
        System.out.println(isPalindrome(12321));

    }
    public static boolean isPalindrome(int number){
        //System.out.println("number % 10 : " +number % 10);
        //while(number != 0){
            //System.out.println("last digit: " +number % 10);
            //number /= 10; // number = number / 10
            //System.out.println("number after / 10 :" +number);
            //System.out.println();

            int reverse = 0;
            int temp = number;//1234
            while(temp != 0){
                int lastDigit = temp % 10; //4
                reverse = (reverse * 10) + lastDigit;
                temp /= 10;
                System.out.println(reverse);
            }
            return reverse == number;

        }

    }

