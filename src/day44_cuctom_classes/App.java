package day44_cuctom_classes;

/**
 * App class is used as a template for App objects.
 * We are describing app properties and behavior here. objects will be able to use them
 */
public class App {
    String name; //null by default
    double version; //0.0 by default
    // open method using name and version variables
    public void open() {
        System.out.println("opening " +name +" app - version = " +version);

    }
}