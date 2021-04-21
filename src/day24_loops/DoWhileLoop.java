package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        do{
            System.out.println("counter = " + counter);
            counter +=5;
        }while(counter <= 1000);
    }
}
