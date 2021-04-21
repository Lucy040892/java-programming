package day12_conditinal_statements;

public class IfElseStatement {
    public static void main(String[] args){
        if(10 > 11) {
            System.out.println("CONDITION IS TRUE");
        }else{
            System.out.println("CONDITION IS FALSE");
        }
        int count = 25;
        //check if count is more than 30. If yes, print "count is more than 30"
        //otherwise print "count is less than 30"
        if(count > 30){
            System.out.println("Count is more than 30");
        }else{
            System.out.println("Count is less than 30");
        }
        byte age = 25;
        if(age >= 18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
