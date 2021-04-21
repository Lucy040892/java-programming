package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); // true
        System.out.println(company.contains("l o")); // true

        if(company.contains(" ")){
            System.out.println("Multiple words in company name");
        }else{
            System.out.println("Single word in company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass - title check passed");
        }else{
            System.out.println("Failed");
        }

        String firstName = "ahmed";
        //check if firstname contains "a" and "e" at the same time
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("Both a && e are present");
        }else{
            System.out.println("a || e is not present");
        }

        String email = "Komisarenkoliudmyla@gmail.com";

        if(email.contains("isaren") && email.endsWith(".com")){
            System.out.println("This is my email");
        }else{
            System.out.println("Not mine email");
        }

        if(email.toLowerCase().contains("k")){
            System.out.println("Email");
        }



    }
}
