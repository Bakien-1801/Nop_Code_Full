package AbstractFactory.AbstractFactory_Demo;

public class AbstractFactory {
   public Shape getShape(String shapeType) {
      if (shapeType == null) {
         return null;
      } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new Rectangle();

      } else if (shapeType.equalsIgnoreCase("SQUARE")) {
         return new Square();
      } else if (shapeType.equalsIgnoreCase("ROUNDED RECTANGLE")) {
         return new RoundedRectangle();
      } else if (shapeType.equalsIgnoreCase("ROUNDED SQUARE")) {
         return new RoundedSquare();
      }
      return null;
   }

}
