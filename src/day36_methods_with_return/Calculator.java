package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5,9));
        double sum = add(1, 4);
        System.out.println("sum = " +sum);
        System.out.println("100.00 + 300.00 = " +add(100, 200));
        System.out.println(minus(5, 3));
        System.out.println(multiply(2, 10));
        System.out.println(divide(15, 5));

    }
    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double minus(double num1, double num2){
        double sum = num1 - num2;
        return sum;
    }
    public static double multiply(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }
    public static double divide(double num1, double num2){
        double sum = num1/num2;
        return sum;
    }
}
