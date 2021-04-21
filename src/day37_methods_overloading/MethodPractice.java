package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));

    }
    public static String repeatString(String word, int times, char delimiter){
        String retValue = "";
        for(int n = 1; n <= times; n++){
            //take care of last delimiter:
            if(n == times){ //last iteration
                retValue += word; // add only word by itself
            }else{
                retValue += word + delimiter; // add with delimiter
            }

        }
        return retValue;
    }
}
