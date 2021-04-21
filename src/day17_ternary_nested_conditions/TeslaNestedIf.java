package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = '3';
        String trim = "Plaid";

        if(model == 'S'){
            if(trim.equals("Long range")){
                System.out.println("Range: 412");
                System.out.println("Top speed: 155 mph");
                System.out.println("0-60 - 3.1 sec");
            }else if(trim.equals("Plaid")){
                System.out.println("Range: 390");
                System.out.println("Top speed: 200 mph");
                System.out.println("0-60 - 1.99 sec");
            }else if(trim.equals("Plaid+")){
                System.out.println("Range: 520");
                System.out.println("Top speed: 200 mph");
                System.out.println("0-60 < 1.99 sec");
            }
        }else if(model == '3'){
            System.out.println("Range: 263");
            System.out.println("Top speed: 140 mph");
            System.out.println("0-60 - 5.3 sec");
        }

    }
}
