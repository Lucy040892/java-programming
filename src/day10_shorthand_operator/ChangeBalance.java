package day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args){
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after kenafa = " + balance);
        //second kenafa is 50% off. Lets buy it
        balance = balance - kenafa *0.5;
        System.out.println("balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);
        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - 4 * icedTea;
        System.out.println("balance = " + balance);


    }
}
