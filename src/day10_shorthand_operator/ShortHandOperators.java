package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars = 10;
        System.out.println("Cars in parking lot = " + cars);
        cars = cars +2;
        System.out.println("cars = " + cars);
        cars += 5; //shortcut
        System.out.println("cars = " + cars);
        //6 cars left the parking lot
        cars -= 8;
        System.out.println("Cars in the parking lot " +cars);

        int electricCars = 13;
        //cars = cars +electricCars;
        cars += electricCars;
        System.out.println("cars = " + cars);

        String word = "Java";
        System.out.println("word = " + word);


        word = word +"programming";
        System.out.println("word = " + word);
        //add " is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 1 to letter
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee " +parkingFee);
        //early bird fee is 50% off
        parkingFee *= 0.5;
        System.out.println("Early bird parkingFee = " + parkingFee);
        //weekend parking is free
        parkingFee -= parkingFee;// parkingFee = parkingFee - parkingFee;
        System.out.println("Weekend parkingFee = " + parkingFee);








    }
}
