package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;

    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make); //this.make = make; they are same, useful when setter haa a condition
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    // model3.drive(34);
    protected void drive(int miles) {
        if(range == 0 || range - miles < 0) {
            System.out.println("ERROR: Cannot drive that far, need to charge");
        }else{
            range -= miles;
            System.out.println("Driving " +miles + " miles ...");
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make.isEmpty()) {
            System.out.println("Make can not be blank");
        }else{
            this.make = make;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
