package OfficeHours.Practice_04_12_2021;
import java.util.*;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        //Here we are getting dynamic array from the user by asking for the numbers
        //int[] nums = {4, 1, 3, 12, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have?");
        int[] nums = new int [input.nextInt()]; // 0 0 0 0 0

        for(int i = 0; i < nums.length; i++){
            System.out.println("enter number " +(i+1));
            nums[i] = input.nextInt();
        }
        //We are counting odd and even values from users array
        int even = 0;
        int odd = 0;
        //String even += num +" " split by space -> String[]
        for(int each : nums){
            if(each % 2 == 0){ //checks odd: eachNum % 2 != 0 or eachNum % 2 == 1
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Count even numbers: " +even);
        System.out.println("Count odd numbers: " +odd);

        //Used the counters of even and odd to make new arrays to store the values

        int[] evenNumbers = new int[even];
        int[] oddNumbers = new int[odd];

        // Here we go through ever element, checks if its even or odd.
        // Then it will store the number into the even or odd array
        // This storage is based on the e and o variables
        /*
           i -> keep track of the indexes in your nums array
           e -> keep track of the indexes in our evenNumbers array
           o -> keep track of the indexes in our oddNumbers array
         */
        for(int i = 0, e = 0, o = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenNumbers[e++] = nums[i];
            }else{
                oddNumbers[o++] = nums[i];
            }

        }
        //Print the final arrays of even and odd numbers
        System.out.println("Even arrays " +Arrays.toString(evenNumbers));
        System.out.println("Odd arrays " +Arrays.toString(oddNumbers));


    }
}
