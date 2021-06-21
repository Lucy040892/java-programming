package day55_abstraction.exercise_example;

public abstract class Lifting extends Exercise{
    /**
     * Abstract class can have another abstract class
     * In that case, sub class does not need to override abstract methods
     * First concrete, non abstract child class will override all abstract methods
     */

    public abstract void endLift();

}
