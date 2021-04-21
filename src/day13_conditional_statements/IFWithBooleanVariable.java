package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args){
        boolean isHungry = false;
        if(isHungry == true){
            System.out.println("I am hungry I will go get something to eat.");
            System.out.println("Then code java.");
        }else{
            System.out.println("I am not hungry, lets keep coding java!");
        }
        double price = 130.44;
        boolean isAffordable = price<= 200.0; //200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable){
            System.out.println("I can afford it, lets buy!");
        }else{
            System.out.println("Too expensive, lets keep coding java");
        }
        boolean isRemoteJob = true;
        //if it is NOT remoteJob print "Sorry I am not interested"
        //otherwise, print "sure I am not interested, what is the interview process?"
        //if(isRemoteJob != true){
        //if (isRemoteJob == false){
        if(!isRemoteJob){
            System.out.println("Sorry I am not interested.");
        }else{
            System.out.println("Sure, I am interested, what is interview process?");
        }



    }

}
