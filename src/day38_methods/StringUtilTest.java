package day38_methods;
/**
 * import all static methods from different classes, when we use a class
 * which is not in the same package, we need to import it
 */
import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: UserName cannot be null or empty.");
        }
        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));


    }

}
