package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if(weather.equals("sunny")){
            System.out.println(weather +" - Go to pak, hiking and code Java");
        }else if(weather.equals("rainy")){
            System.out.println(weather +" - Stay home and code Java");
        }else{
            System.out.println("Just keep coding Java");
        }
    }
}
