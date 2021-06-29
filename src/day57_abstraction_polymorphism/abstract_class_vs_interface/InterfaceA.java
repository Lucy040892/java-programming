package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA  {
    //constants
    public static final String TYPE = "interface";
    double MAX_COUNT = 500; //this also public static final
    /**Interface can ONLY have PUBLIC STATIC FINAL variables
     * Interfaces can ONLY use PUBLIC access modifier for all variables and methods
     * Interfaces can not have constructors
     */
    //public InterfaceA() {
        //System.out.println("Constructor is not welcome in Interface");
    //}

    public abstract void absMethodD(int num);
    //starting from Java 8 (jdk 1.8)
    //interface can have static and default methods
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " +str);
    }
    //default method - is a method with a body in the interface
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
