package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }
    //first non-abstract child class of Abstract class or interface - called Concrete class
    //class can extend ONE abstract class and implement MULTIPLY interfaces
    //Concrete sub class must override abstract methods from abstract class or interface
    //Sub class can override non-final methods from parent class
    //Static methods are hidden -  not overridden

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    //@Override -> static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");

    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden method is called - " +num);
    }
}
