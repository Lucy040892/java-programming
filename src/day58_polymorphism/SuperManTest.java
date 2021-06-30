package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); ERROR spMan1 is Father type can only access methods in Father
        //work method inherited from Worker interface, so father does not have access to it

        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println("got paid $" +spMan2.getPaid());
        //spMan2.raiseKid(); ERROR, superman is now worker, method is not from Worker interface
        //so spMan2 does not have access

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();
        spMan3.work("Scrum Master");//Superman is superman now and has access to all methods from Superman class
    }
}
