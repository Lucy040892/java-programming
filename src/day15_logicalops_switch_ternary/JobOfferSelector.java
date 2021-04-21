package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args){
        //location, salary, isRemote, benefits
        String location = "Chicago";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean benefits = true;
        if(location.equals("Chicago") && salary>=120_000.0 && isRemote && benefits){
            System.out.println("I will choose this job.");
        }else{
            System.out.println("I will keep looking for the job.");
        }
    }
}
