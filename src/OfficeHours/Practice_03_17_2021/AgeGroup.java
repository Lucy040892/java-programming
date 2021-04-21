package OfficeHours.Practice_03_17_2021;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 10;
        if (age > 0 && age < 120) { //if(age > 120 || age < 0)
            // valid age
            if (age <= 2) {
                System.out.println("Infant");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");

            } else {
                System.out.println("Invalid age");

            }
        }
    }
}