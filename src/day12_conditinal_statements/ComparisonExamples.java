package day12_conditinal_statements;

public class ComparisonExamples {
    public static void main(String[] args){
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " +isSpeeding);
        currentSpeed +=20; //65
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " +isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " +(accountBalance>= itemPrice)); //true
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford? - " +canAfford);

        //decrease balance by ItemPrice using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " +isBroke);







    }
}
