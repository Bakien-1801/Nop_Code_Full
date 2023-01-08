package Design_Patterns.Strategy.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        mallard.display();
        rubberDuckie.display();
        decoy.display();
        model.display();

        mallard.swim();
        rubberDuckie.swim();
        decoy.swim();
        model.swim();

        mallard.performFly();
        rubberDuckie.performFly();
        decoy.performFly();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();

        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
        



    }
}
