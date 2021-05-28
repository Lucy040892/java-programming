package day46_encapsulation;

public class Car {
    //ENCAPSULATED/hidden instance variables
    private String model; //private is an access modifier, when variable is private
    // it can only be accessed in te same class
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }
    //getter method for model
    public String getModel() {
        return model;
    }
    //setter for year
    public void setYear(int year) { //if we use the same name of variable and parameter,
        //we should put this. in this case java knows we will use instance variable
        this.year = year;
    }
    //getter for year
    public int getYear() {
        return year;

    }
    //generate toString
    public int getMileage() {
        return mileage;

    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
