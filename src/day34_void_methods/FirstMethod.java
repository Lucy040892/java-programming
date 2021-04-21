package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();// 1st call the method
        displayMessage();// 2nd call the method
        displayMessage();

        for(int i = 0; i <= 100; i++){
            System.out.print(i +" - ");
            displayMessage();
        }
    }
    // first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");
    }
}
