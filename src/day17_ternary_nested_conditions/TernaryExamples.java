package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 75;
        String result1 = (score1 > 60) ? "Pass" : "Fail";
        System.out.println("result1 = " + result1);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("x = " + x);

        int score2 = 95;
        char grade = (score2 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        
        int score3 = 60;
        String evenOrOdd = (score3%2 == 0) ? "even" : "odd";
        System.out.println("evenOrOdd = " + evenOrOdd);
    }
}
