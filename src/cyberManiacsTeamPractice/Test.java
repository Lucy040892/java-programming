package cyberManiacsTeamPractice;
import java.util.*;

public class Test {
    static int a;
    int b;

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.b = 10;
        obj1.a = 20;
        Test obj2 = new Test();
        obj2.b = 30;
        obj2.a = 40;
        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }

}
