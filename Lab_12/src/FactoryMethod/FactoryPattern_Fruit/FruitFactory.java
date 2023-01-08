package FactoryMethod.FactoryPattern_Fruit;

public class FruitFactory {
   Fruit providerFruit(String name) {
      switch (name) {
         case "Apple":
            return new Apple();
         case "Banana":
            return new Banana();
         case "Orange":
            return new Orange();
      }
      throw new RuntimeException("No matching object could be created.");
   }
}
