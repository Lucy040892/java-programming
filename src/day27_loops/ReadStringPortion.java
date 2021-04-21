package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";
        //using substring print first 3 letters
        //System.out.println(list.substring(0,3));
        //System.out.println(list.substring(1,4));
        //System.out.println(list.substring(2,5));
        for(int i = 0; i < list.length()-2; i++ ){ //-2 to prevent out of bound
            System.out.println(list.substring(i, i+3));
            //if statement if list.substring(i, i+3) equals "cat" or "car" -> print "cat or car found"
            //String part = list.substring(i, i+3); we can do it with variable
            if(list.substring(i, i+3).equals("cat") || list.substring(i, i+3).equals("car")){
                System.out.println("cat or car found");
            }

        }

    }
}
