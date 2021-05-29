package day48_constructors_static;

public class Engine {
    public int getCylinders() {
        return cylinders;
    }

    public Engine() {
    }

    public Engine(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    private int cylinders;

}
