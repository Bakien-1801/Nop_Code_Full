package IteratorPattern.Product;

public class Application {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Iterator iterator = catalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
