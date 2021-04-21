package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Austin";
        if(city.equals("New York") || city.equals("Los Angeles")){
            System.out.println("Willing to relocate to " +city);
        }else{
            System.out.println("Not considering " +city);
        }
        String teacher = "Akbar";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " +teacher);
        }else{
            System.out.println("Soft skill class with " +teacher);
        }
        //1 - teacher Saim or Murodil -> It is a java class
        //2 - teacher Nadir -> Soft skill class with
        //any other teacher -> Some class with Gurhan/Akbar
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " +teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skills class with " +teacher);
        }else{
            System.out.println("Some class with " +teacher);
        }
        //company - "Google", salary >= 100K
        String company = "Apple";
        double salary = 120_000.0;
        if(company.equals("Google") || salary>=100_000.0){
            System.out.println("I will accept this job at " +company);
        }else{
            System.out.println("I will look for another job.");
        }

    }
}
