package day44_cuctom_classes;

/**
 * This class is used to create object of APP class
 */

public class MyApps {
    public static void main(String[] args) {
        //String app1 = "uber"; this is string object. just characters
        App uberApp = new App(); // creating new object
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        System.out.println(uberApp.name);
        uberApp.open();//call open method using object

        uberApp.version = 4.0;
        uberApp.open(); //open new version

    }
}
