package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);//true 10 equal 10
        System.out.println(1000>100);//true 1000 is grater than 100
        System.out.println(985.44<94587.8);
        System.out.println(10<=9);
        System.out.println(10!=8);//true 10 NOT equal to 8 != means not equal

        boolean result = 5==5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);
        result = 88<99;
        System.out.println("result = " + result);
        result = 10>=10;
        System.out.println("result = " + result);

        String city ="Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fox");

        String name = "Nadir";
        boolean checkName = name=="Nadir";
        System.out.println("checkName = " + checkName);
        checkName = name!="Kuzzat";
        System.out.println("checkName = " + checkName);




    }
}
