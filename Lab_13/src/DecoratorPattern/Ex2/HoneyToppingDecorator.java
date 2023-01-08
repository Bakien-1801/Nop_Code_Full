package DecoratorPattern.Ex2;

public class HoneyToppingDecorator extends ToppingDecorator{
      public HoneyToppingDecorator(IceCream iceCream) {
         super(iceCream);
      }
   
      @Override
      public String getDescription() {
         return super.getDescription() + " with honey";
      }

    @Override
    public void addTopping(String topping) {
         super.addTopping(topping);
    }
}
