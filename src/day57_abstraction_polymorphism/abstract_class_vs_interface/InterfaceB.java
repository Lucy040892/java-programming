package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

/**
 * Interface CAN EXTEND Multiple Other Interfaces.
 * Interfaces support Multi-Inheritance
 * When it extends another interface, child interface is not responsible to override any methods
 * Concrete sub class will be responsible for overridding all abstract methods
 */

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    //MARKER INTERFACE - interface without any methods or variables. We can use it for
    //polymorphism or to mark the class as capable of whatever interface claims
}
