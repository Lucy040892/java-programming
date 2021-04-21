package day19_class_vs_objects_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "cybertek";
        System.out.println(word.startsWith("cyb")); //true

        System.out.println("java". startsWith("j")); //true

        System.out.println("java".startsWith("J")); //false case sensitive
        System.out.println(word.endsWith("tek")); // true

        String name = "Irina";
        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");
        }

        String firstName = "Dr. Liudmyla";
        if(firstName.startsWith("Mr.")){
            System.out.println("Mr. Man");
        }else if(firstName.startsWith("Dr.")){
            System.out.println("Dr. Doctor");
        }else if(firstName.startsWith("Mrs.")){
            System.out.println("Mrs. Married woman");
        }else if(firstName.startsWith("Ms.")) {
            System.out.println("Ms. Single woman");
        }else if(firstName.startsWith("Sr.")){
            System.out.println("Sr. Senior");
        }

        String url = "https;//www.zara.com";

        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }

    }
}
