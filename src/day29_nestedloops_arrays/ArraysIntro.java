package day29_nestedloops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int[] nums = new int[3];//array variable, 3 means this array can hold 3 values
        nums[0] = 5; // starts with index 0
        nums[1] = 10;
        nums[2] = 7;
        // print value of array
        System.out.println("Value at index O = " +nums[0]);
        System.out.println("Value at index 1 = " +nums[1]);
        System.out.println("Value at index 2 = " +nums[2]);

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]);//10

        //how to find out the size of the array
        System.out.println("The numbers of elements " +nums.length);

        //store length of the array into len variable
        int len = nums.length;
        System.out.println("len = " +len);

        //change values in the array
        nums[0] = 100;
        nums[1] = 300;
        //read the value of index 1 and assign same to index 2
        nums[2] = nums[1];
        System.out.println("nums[0] = " +nums[0]);
        System.out.println("nums[1] = " +nums[1]);
        System.out.println("nums[2] = " +nums[2]);





    }
}
