package OfficeHours.Practice_05_19_2021;

public class MyBackYard {
    public static void main(String[] args) {
        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        birdOne.setCanFly(true);
        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());

    }
}
