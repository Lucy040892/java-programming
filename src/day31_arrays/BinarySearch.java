package day31_arrays;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
       int[] nums = {23, 123, 654, 2344, 12345, 14421};// needs to be sorted to use binarySearch
        System.out.println(Arrays.binarySearch(nums, 23)); //0
        System.out.println(Arrays.binarySearch(nums, 25)); //-2
        System.out.println(Arrays.binarySearch(nums, 700));//-4
        //check if number 12345 is there
        if(Arrays.binarySearch(nums, 12345) >= 0){
            System.out.println("12345 is present in Array");
        }else{
            System.out.println("12345 is not present in Array");
        }

    }
}
