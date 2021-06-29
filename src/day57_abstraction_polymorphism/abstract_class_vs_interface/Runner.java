package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA(); we cannot object(instantiate)
        //InterfaceA iA = new InterfaceA(); neither of them
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();
    }
}
