package day40_arrayList;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        nums.add(34);
        nums.add(44);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(3);

        System.out.println("nums = " +nums);
        //nums.remove(44); Index 44 -> IndexOutOfBoundsException
        nums.remove(new Integer(44)); //removes number 44, not 44th Index
        System.out.println("nums = " +nums);

        nums.remove(new Integer (3)); // we have 2 numbers with values 3, but it removes only first one
        System.out.println(nums);

        //for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }

        //for each loop, and print all in same line
        for(int each : nums){
            System.out.print(each + " ");
        }



    }
}
