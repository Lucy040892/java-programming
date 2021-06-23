package day56_abstraction.greeting;

import day56_abstraction.greeting.Greeting;

public class Japanese implements Greeting {
    @Override
    public void hi() {
        System.out.println("Konichuva");
    }

    @Override
    public void bye() {
        System.out.println("Sayonara");
    }
}
