package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        int budget = 5000;
        String model = "Honda";
        int carPrice = 6000;
        if((model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) && carPrice<=budget ){
            System.out.println("I will buy this " +model);
        }else{
            System.out.println("I will not buy this " +model);
        }
    }
}
