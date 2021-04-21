package day29_nestedloops_arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int outer = 1; outer <= 5; outer++){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();// go to new line
        }

        for(int outer = 1; outer <= 5; outer++){
            for(int inner = 5; inner >= outer; inner--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
