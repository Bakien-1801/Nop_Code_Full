package IteratorPattern.Product;

public class ProductIterator implements Iterator {
    private String[] products;
    private int position;

    public ProductIterator(String[] products) {
        this.products = products;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= products.length || products[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override

    public Object next() {
        String product = products[position];
        position = position + 1;
        return product;
    }


}
