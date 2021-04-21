package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 4;
        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return
         */
        if(num < 1 || num > 10){
            System.out.println("ERROR: invalid input");
            return;//exit main method, stop the program
        }
        //System.out.println(num +" x " + 1 +" = " +(num * 1));
        //System.out.println(num +" x " + 2 +" = " +(num * 2));
        //System.out.println(num +" x " + 3 +" = " +(num * 3));
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num +" x " + i +" = " +(num * i));

        }
    }
}
