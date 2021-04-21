package OfficeHours.Practice_03_22_2021;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true;
        int age = 18;
        boolean hasHighSchoolDiploma = true;

        if(citizenship.equalsIgnoreCase("USA") || resident){
            if(age >= 18 && age <= 35 ){
                if(hasHighSchoolDiploma){
                    System.out.println("You are qualified for the USA army.");
                }else{
                    System.out.println("You must have a high school diploma.");
                }

            }else{
                System.out.println("Your age must be between 18 and 35 years old.");
            }

        }else{
            System.out.println("you must be USA citizen or resident.");

        }
    }
}
