package day55_abstraction.interfaces_demo;

public interface MyInterface { //interface keyword is used to create an interface in java
                               //we can not create object in interface
    public abstract void learn();
}

interface  MyInterface2 {

}

class MyClass implements MyInterface, MyInterface2{ //class can implement multiply interfaces.
                                                    // And must override abstract methods of all interfaces
    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    } //Class implements interface to inherit from it.
                                       //It does not extend. Class can implement multiply interfaces in the same time

}
class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); ERROR: cannot create object of Interface
        MyClass myClass = new MyClass();
    }
}
