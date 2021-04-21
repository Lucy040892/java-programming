package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("----------PRICES MORE THAN 100-----------");
        for(double eachPrices : prices){
            if(eachPrices > 100.00){
                System.out.print(eachPrices + " ");
            }
        }
        System.out.println("\n-------PRICES BETWEEN 10 AND 70 inclusive------------");
        for(double price : prices){
            if(price >= 10 && price <= 70){
                System.out.print(price + " ");
            }
        }
        System.out.println("\n--------count the prices that are more than 50-----");
        //count = 7;
        int count = 0;
        for(double more50 : prices){
            if(more50 > 50){
                count++;
            }
        }
        System.out.println("Count prices > 50 = " +count);

        System.out.println("\n------countries with name more than 7 letters inclusive------");
        for(String country : countries){
            if(country.length() >= 7){
                System.out.print(country +" ");
            }
        }

    }
}
