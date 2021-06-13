package day53_inheritance.final_keywords;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; //ERROR can not change the value of final variable

    }
}
