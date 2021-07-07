package day60_exceptions;
import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            System.out.println("You entered " + num);
            //System.exit(0); // stop java alltogether, finally block will not run
        } catch (InputMismatchException e) {
            System.out.println("You entered invalid value!");
        } finally {
            scan.close();//close and clean up the scanner
            System.out.println("Finally block - runs always");
        }
    }
}
