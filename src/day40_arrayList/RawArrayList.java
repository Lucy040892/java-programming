package day40_arrayList;
import java.util.*;

public class RawArrayList { //Raw ArrayList can store objects of ANY TYPE.
    // It is not recommended to use like this, unless in certain cases.
    public static void main(String[] args) {
        //Declare raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();
        //Add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println("size: " +list1.size());

    }
}
