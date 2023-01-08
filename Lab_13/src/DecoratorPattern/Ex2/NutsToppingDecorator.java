package DecoratorPattern.Ex2;

public class NutsToppingDecorator extends ToppingDecorator{
      public NutsToppingDecorator(IceCream iceCream) {
         super(iceCream);
      }
   
      @Override
      public String getDescription() {
         return super.getDescription() + " with nuts";
      }

    @Override
    public void addTopping(String topping) {
         super.addTopping(topping);
    }
}
