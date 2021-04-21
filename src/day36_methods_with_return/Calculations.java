package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 55 = " + Calculator.add(10, 55));
        System.out.println("10 minus 2 = " + Calculator.minus(10, 2));
        System.out.println("23 * 23 = " + Calculator.multiply(23, 23));
        System.out.println("125 divide by 5 = " + Calculator.divide(125, 5));

        double d1 = 23.65;
        double d2 = 11.87;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " +result);
    }
}
