package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args){
        int number = 0;

        if(number == 0){
            System.out.println("zero");
        }else if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }
    }
}
