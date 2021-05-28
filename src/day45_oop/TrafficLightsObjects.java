package day45_oop;

public class TrafficLightsObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLights trafficLight = new TrafficLights();
        //trafficLight.color = "red"; NOT THIS WAY today
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //System.out.println("current color = " +trafficLight.color);//DIRECT access to variable. Not recommended
        //call method to acces the variable:
        trafficLight.showColor();
        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLights trafficLight2 = new TrafficLights();
        trafficLight2.color = "black";
        trafficLight2.showColor();
        trafficLight2.changeColor("blue");

    }
}
