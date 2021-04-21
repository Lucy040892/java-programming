package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("Asd"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " +isNullOrEmpty(word) );
        word = "";
        System.out.println("isNullOrEmpty(word) = " +isNullOrEmpty(word) );
        System.out.println("isPalindrome(Civic) = " +StringUtils.isPalindrome("Civic"));
        System.out.println("isPalindrome(reno) = " +StringUtils.isPalindrome("reno"));


    }
    public static boolean isNullOrEmpty(String str){
        //return(str == null || str.isEmpty())
        if(str == null || str.isEmpty()) { // NULL we need to check first,
            // because if not we will have NullPointerException error,
            //because we are trying to run a String method on NO STRING/NULL;
            return true;
        }
            return false;
        }

        public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1 -i)){
                return false;
            }
        }
                return true;
        }

        public static String reverse(String str){
        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed += str.charAt(i);

            }
        return reversed;
        }
    }

