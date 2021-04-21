package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 44;
        int num3 = 11;

        if(num1 >= num2 && num1 >= num3){
            System.out.println("Largest number is " +num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("Largest number is " +num2);
        }else if(num3 >= num1 && num3 >= num2){
            System.out.println("Largest number is " +num3);
        }
    }
}
