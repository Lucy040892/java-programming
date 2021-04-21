package day38_methods;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23, 54, 66, 93});

        System.out.println("sum = " +ArrayUtils.sum(nums));
        System.out.println("sum = " +ArrayUtils.sum(new int[]{23, 54, 66, 93}));

        int[] nums2 = {4, 1, 5, 8};

        System.out.println("found = " +ArrayUtils.contains(nums2, 5));
        System.out.println("found = " +ArrayUtils.contains(nums2, 10));
    }
}
