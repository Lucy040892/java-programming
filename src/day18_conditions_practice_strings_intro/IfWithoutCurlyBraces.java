package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args){
        String todayClass = "python";

        if(todayClass.equals("java")) //without curly {} braces ONLY ONE statement will attach!
            System.out.println("java is fun");
        else
            System.out.println("It is not java. It is " +todayClass);

    }
}
