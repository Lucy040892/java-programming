package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        int count = 98;
        displayValue(count);//num = count
        greetByName("Lucy");
        String name = "Nadir";
        greetByName(name);

    }
    public static void displayValue(int num){
        System.out.println("value is " +num);
    }
    public static void greetByName(String name){
        System.out.println("Hello, " +name +", how are you today?");
    }
}
