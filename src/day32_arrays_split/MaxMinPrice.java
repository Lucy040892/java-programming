package day32_arrays_split;
import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //print array values as String, in the ssame line, with no loop
        System.out.println(Arrays.toString(items));
        //find and print details of the most expensive item
        double maxPrice = prices[0];//assume first price is max
        int indexOfMaxPrice = 0;//assume max price is at index 0
        for(int i=0; i < items.length; i++){
            if(prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("The most expensive item is "+items[indexOfMaxPrice] +" - $" +prices[indexOfMaxPrice] +" - #" +itemIDs[indexOfMaxPrice]);
        //find and print details of least expensive item
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        for(int i = 0; i < items.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println("The least expensive item is "+items[indexOfMinPrice] +" - $" +prices[indexOfMinPrice] +" - #" +itemIDs[indexOfMinPrice]);

    }
}
