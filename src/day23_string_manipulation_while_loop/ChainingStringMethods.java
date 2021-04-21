package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "chicago";
        System.out.println(city.substring(0, 1).toUpperCase() + city.substring(1));
    }
}
