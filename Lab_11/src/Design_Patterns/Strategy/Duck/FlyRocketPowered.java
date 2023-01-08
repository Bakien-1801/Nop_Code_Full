package Design_Patterns.Strategy.Duck;

public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
