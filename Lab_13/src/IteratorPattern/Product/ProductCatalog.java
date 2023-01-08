package IteratorPattern.Product;

public class ProductCatalog implements Iterable {
    private String[] productCatalog = {"Apple", "Banana", "Orange", "Grapes", "Pineapple", "Watermelon", "Mango", "Papaya", "Strawberry", "Blueberry"};

      @Override
      public Iterator getIterator() {
          return new ProductIterator(productCatalog);
      }

}
