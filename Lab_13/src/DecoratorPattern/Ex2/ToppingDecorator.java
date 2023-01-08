package DecoratorPattern.Ex2;

public class ToppingDecorator implements IceCream{
      protected IceCream iceCream;
      public ToppingDecorator(IceCream iceCream) {
         this.iceCream = iceCream;
      }
      @Override
      public String getDescription() {
         return iceCream.getDescription();
      }

      //addTopping() method is added to the interface
      public void addTopping(String topping) {
         System.out.println("Adding topping: " + topping);
      }
      
}
