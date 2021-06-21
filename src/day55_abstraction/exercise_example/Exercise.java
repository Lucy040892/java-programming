package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start() { //non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    public abstract void perform(); //abstract method - method without body/implementation, just signature
                                    //purpose: letting sub classes implement/override their own way
    //another abstract method that concrete sub classes will override/implement
    //@param minutes - how long is exercise is performed
    //@return number of calories burned/used
    public abstract int getCaloriesCount(int minutes);
}
