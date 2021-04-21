package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(5, 55, 489, 87);
        addNumbers(6, 8);
    }
    // varargs
    public static void addNumbers(int... nums){
        //inside the method it is used as regular array
        int sum = 0;
        for(int n : nums ){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
