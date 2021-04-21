package day19_class_vs_objects_string;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Liudmyla";
        System.out.println(firstName +"-" +firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        //int length = password.length();

        if(password.length() >= 6){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password does not match the rules");
        }


    }
}
