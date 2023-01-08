package DecoratorPattern.Ex2;

public class Application {
    public static void main(String[] args) {
        IceCream vanilla = new VanillaIceCream();
        System.out.println(vanilla.getDescription());

        IceCream strawberry = new StrawberryIceCream();
        System.out.println(strawberry.getDescription());

        IceCream chocolate = new ChocolateIceCream();
        System.out.println(chocolate.getDescription());

        IceCream honey = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(honey.getDescription());

        IceCream nuts = new NutsToppingDecorator(new ChocolateIceCream());
        System.out.println(nuts.getDescription());

        IceCream honeyNuts = new NutsToppingDecorator(new HoneyToppingDecorator(new VanillaIceCream()));
        System.out.println(honeyNuts.getDescription());


    }
}
