package day61_exceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("Class is going on for " +minutes +" minutes");
        if(minutes > 50) {
            //throw new BreakTimeException();//we create custom "BreakTimeException" by adding class, which extends RuntimeException
        throw new BreakTimeException("It is Break Time!");
        }
        System.out.println("Let's continue the class");

        double balance = 400;
        double itemPrice = 500;
        if(itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough founds");
        }
        System.out.println("Transaction is successful");
    }
}
