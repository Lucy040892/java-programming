package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " +count);


        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }
        String sentence = "I wrote 70 lines of code";
        //split by space, parse index 2 to int
        String[] sentArray = sentence.split(" ");
        String ind2 = sentArray[2];
        int linesOfCode = Integer.parseInt(ind2);
        System.out.println("linesOfCode = " +linesOfCode);

    }
}
