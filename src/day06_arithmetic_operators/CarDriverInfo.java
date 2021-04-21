package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Mini Cooper";
        String driverName = "Lucy";
        String licenseName = "D123456";
        byte speed = 5;
        boolean automatic = true;
        char licenseClass = 'D';
        System.out.println("Car Model: " +carModel);
        System.out.println("Driver Name: " +driverName);
        System.out.println("License Name: " +licenseName);
        System.out.println("Speed: " +speed);
        System.out.println("Automatic: " +automatic);
        System.out.println("License Class: " +licenseClass);
        System.out.println(driverName+" is driving "+carModel);
        System.out.println("Current speed is "+speed+" mph");
    }
}
