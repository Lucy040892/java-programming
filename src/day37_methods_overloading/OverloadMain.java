package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method!");
        main(28, 18);
    }
    /**
    overloading main method:
     same name + different parameter
     JDK does not look for this one to run
     */
    public static void main(int num1, int num2){
        int result = num1 + num2;
        System.out.println("result = " +result);
    }
}
