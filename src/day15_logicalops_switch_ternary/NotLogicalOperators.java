package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        System.out.println("!true = " +(!true));
        System.out.println("!false = " +(!false));

        int age = 8;
        //check if age IS NOT more than 7. Print "Need to sit in a child car seat."
        if(!(age > 7)){
            System.out.println("Need to sit in a child car seat.");
        }else{
            System.out.println("Can sit normal seat");
        }
        boolean isSmokingAllowed = false;
        // if smoking is not allowed, print "Smoking is not allowed. Exit."
        if(!isSmokingAllowed){
            System.out.println("Smoking is not allowed. Exit.");
        }
        boolean isAffordable = true;
        //if it IS NOT affordable, then print "Not affordable"
        if(!isAffordable){
            System.out.println("Not affordable.");

            String carModel = "Tesla";
            //if its not Tesla, print "Not interested"
            if(!carModel.equals("Tesla")){
                System.out.println("Not interested");
            }
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if Input is NOT equals secretPassword, print "Not Correct Password"
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Not Correct Password");
        }


    }
}
