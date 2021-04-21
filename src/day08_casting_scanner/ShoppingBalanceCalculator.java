package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){
        double initialBalance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.00;

        double remainingBalance = initialBalance - (price1 + price2 + price3);
        //initialBalance = remainingBalance;
        System.out.println("Your initial balance: $" +initialBalance);
        System.out.println("Your remaining balance: $" +remainingBalance);
        int balanceWithNoCents = (int)remainingBalance;
        System.out.println(balanceWithNoCents);
        System.out.println("Your remaining balance without cents: $" +balanceWithNoCents);

    }
}
