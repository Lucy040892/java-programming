package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); // random num 0-70
            System.out.print(source.charAt(index));
            //System.out.println(random.nextInt(source.length()));
            // add the char to password variable using +=
            password += source.charAt(index);
        }
        System.out.println("");
        System.out.println("Your password " +password);
    }
}
