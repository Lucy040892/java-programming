package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop with for loop like: while(true)
        for (; ;) {
            System.out.println("Java is fun!");
        */
        for(int i = 0; i <=5; i++){
            System.out.println("Hello World!");
        }
        //  1)          2)      4)
        for(int i = 1; i <= 10; i++){
            System.out.println(i); // 3)
        }
    }
}
