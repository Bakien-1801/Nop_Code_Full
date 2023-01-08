package FactoryMethod.FactoryPattern_Fruit;

public class CallingClass {
   public static void main(String[] args) {
      FruitFactory fruitFactory = new FruitFactory();
      Fruit fruit = fruitFactory.providerFruit("Apple");
      fruit.produceJuice();
      fruit = fruitFactory.providerFruit("Banana");
      fruit.produceJuice();
      fruit = fruitFactory.providerFruit("Orange");
      fruit.produceJuice();

   }

}
