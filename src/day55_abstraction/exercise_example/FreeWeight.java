package day55_abstraction.exercise_example;

public class FreeWeight extends Lifting {
    /**FreeWeight class is first non-abstract sub class
     * That's why, it must OVERRIDE all inherited abstract methods.
     * Both from Lifting and Exercise
     */

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
