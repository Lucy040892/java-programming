package day28_loops;

public class BreakVSContinue {
    public static void main(String[] args) {
        // BREAK STATEMENTS 123
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;
            }
        } // CONTINUE 135
        for(int i = 1; i <= 5; i++){
            if(i == 2 || i == 4){
                continue; // go to next iterations, skip the code below
            }
            System.out.println(i);
        }
    }
}
