package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlockDemo {
    public static class Inner {
        //variables and methods of inner static class

    }
    static int num;
    static ArrayList<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Audi", "BMW", "Chevrolet"));
    }

    { //initializer block -> runs each time object created, before constructor
        System.out.println("Initializer block");

    }
    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num += 5;

    }
    public StaticBlockDemo(int value) {
        System.out.println("Overloaded constructor - value = " +value);
        num += value;
    }
    //other methods that use the carModels ArrayList
}
