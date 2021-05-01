package OfficeHours.Practice_04_27_2021;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        fib(8);

    }
    public static void fib (int num){
        int[] arr = new int [num+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++){ // we start from index 2, because fib always starts from 0, 1
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        System.out.println(Arrays.toString(arr));
    }
}
