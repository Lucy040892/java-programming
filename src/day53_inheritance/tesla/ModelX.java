package day53_inheritance.tesla;

public class ModelX extends  ElectricCar{

    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }
    /**
     * Error below because charge is final method can not be overridden
     */

    //public void charge() {

    //}
}
