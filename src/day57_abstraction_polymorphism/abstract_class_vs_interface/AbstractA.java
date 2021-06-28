package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    //Abstract class can have abstract, non-abstract, static methods
    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}
