package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "BMW";
        String model = "A3";
        int leasePrice = 500;

        if(make.equals("Mercedes") && model.equals("E")){ //multibranch method
            leasePrice = 500;
        }else if(make.equals("Mercedes") && model.equals("A")){
            leasePrice = 400;
        }

        if(make.equals("Audi")){  // Nested IF method
            if(model.equals("SQ5")){
                leasePrice = 552;
            }else if(model.equals("A3")){
                leasePrice = 412;
            }
        }else{
            System.out.println("Invalid make");
            return; //exit program/ exit main method
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}
