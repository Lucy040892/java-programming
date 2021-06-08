package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlockDemo {
    static int num;
    static ArrayList<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Audi", "BMW", "Chevrolet"));
    }
    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num += 5;

    }
    //other method to use car models
}
