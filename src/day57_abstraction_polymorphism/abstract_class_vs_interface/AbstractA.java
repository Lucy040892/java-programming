package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    //Abstract classes can have instance variables, static variables with all access modifiers
    //private > default > protected > public
    int num1;
    private double price;
    public static int count;
    protected final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        /**
         * Abstract classes can have constructors
         */
        System.out.println("AbstractA constructor");

    }

    //Abstract class can have abstract, non-abstract, static methods
    //Abstract methods cannot be private, static or final
    public abstract void absMethodA();
    public void methodB() {
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}
