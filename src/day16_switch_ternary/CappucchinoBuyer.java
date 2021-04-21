package day16_switch_ternary;

public class CappucchinoBuyer {
    public static void main(String[] args) {
        double price = 0.00;
        int calories = 0;
        String size = "tall";

        switch(size){
            case "tall":
                System.out.println("Tall cappucchino please!");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande cappucchino please!");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappucchino please!");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We do not serve that size of cappuccino");
                break;
        }
        System.out.println("Total price $" + price);
        System.out.println("You will consume " +calories +" cal of energy");
    }
}
