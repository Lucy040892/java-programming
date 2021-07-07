package day19_class_vs_objects_string;


public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //EQUALS() method - case sensitive comparison
        System.out.println(city.equals("Chicago"));// true
        System.out.println(city.equals("chicago"));// false

        //EQUALSIGNORECASE() method CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
    }
}
