package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 15;

        if(number % 3 == 0 && number % 5 ==0){ //this condition should be first !!!
            // Order of IF conditions is important,
            // bc if it is multibranch when first match found, it will not check anymore
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0){
            System.out.println("Fizz");
        }else if(number % 5 == 0){
            System.out.println("Buzz");
        }
    }
}
