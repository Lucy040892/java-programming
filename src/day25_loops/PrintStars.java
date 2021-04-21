package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 1; stars <= 15; stars++){
            System.out.print("* ");
        }
        System.out.println();//start new line
        String myStars = "";
        //for loop: fill 5 stars to myStars variable.
        for(int stars = 1; stars <= 5; stars++){
            //myStars = myStars +"* ";
            myStars += "* ";
        }
        System.out.println("My stars = " +myStars);
    }
}
