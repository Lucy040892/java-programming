package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); //static block runs only once before everything else (15)
        StaticBlockDemo st2 = new StaticBlockDemo(); //static block does not run second time (20)
        StaticBlockDemo st3 = new StaticBlockDemo(); // constructor runs every time when object is created (25)
        System.out.println(StaticBlockDemo.num);//25

    }
}
