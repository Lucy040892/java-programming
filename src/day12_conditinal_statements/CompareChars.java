package day12_conditinal_statements;

public class CompareChars {
    public static void main(String[] args){
        char letter1 = 'A', letter2 = 'J';
        //char letter2 = 'J';
        System.out.println(letter1 == letter2);//65==74
        System.out.println(letter1>letter2);//65>74

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? -" +pass);

    }
}
