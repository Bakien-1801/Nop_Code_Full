package AbstractFactory.AbstractFactory_Demo;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice) {

      if (choice.equalsIgnoreCase("SHAPE")) {
         return new ShapeFactory();

      } else if (choice.equalsIgnoreCase("ROUNDED")) {
         return new RoundedShapeFactory();
      }
      return null;
   }
}
