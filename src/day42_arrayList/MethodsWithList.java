package day42_arrayList;
import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare String arraylist and add values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
        System.out.println(sumIntegerList(Arrays.asList(3, 23, 87, 43, 86)));

        List<Integer> nums = Arrays.asList(54, 87, 87);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);


        /**
         * methodName: printStrList
         * param: List of Strings
         * return: void
         * prints all values separated by space in same line
         */

    }
    public static void printStrList(List<String> stringList) { //"java", "apple", "coffee", "tea"
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

        /**
         * method: sumIntegerList
         * param: List of integers
         * returns int
         * calculates sum of integers in the list then returns
         */

        public static int sumIntegerList(List<Integer> list) {
            int sum = 0;
            for (int i : list) {
                sum += i;


            }
            return sum;

        }


}