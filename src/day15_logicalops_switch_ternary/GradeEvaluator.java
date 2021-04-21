package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'e';
        if((grade == 'A' || grade == 'a') || (grade == 'B' || grade =='b') || (grade == 'C' || grade == 'c')){
            System.out.println("Passed with " +grade);
        }else if(grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retake");
        }else if(grade == 'E' || grade =='e'){
            System.out.println("Fail");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
