package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vws = 2;
        int teslas = 20;
        int nissans = 1;
        int bmws = 155;
        // int toyotas = 431, hondas = 233, ...
        int totalCarsInParking = toyotas + hondas + vws + teslas + nissans + bmws;
        System.out.println(totalCarsInParking);
        System.out.println("There are " +totalCarsInParking +" in parking.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerperson = slices / people;
        System.out.println("There are " +slicesPerperson +" slices per person.");
        System.out.println("We ordered " +pizza +" pizza with " +slices +" slices, " +people
                +" people ate " +slicesPerperson +" slices each." );

    }
}
