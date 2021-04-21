package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "IPhone";
        byte model = 12;
        String color = "White";
        double price = 999.99;
        String storage = "64GB";
        boolean hasACamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasACamera);
        // WITH MESSAGE
        System.out.println("Brand is " +brand);
        System.out.println("Model is " +model);
        System.out.println("Color is " +color);
        System.out.println("Price is $" +price);
        System.out.println("Storage is " +storage +" Memory");
        System.out.println("Has a camera? - " +hasACamera);



    }
}
