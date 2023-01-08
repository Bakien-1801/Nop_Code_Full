package visitor.ex1;

public class VisitorTest {
    public static void main(String[] args) {
        Visitor v = new VisitorImpl();
        Book book1 = new JavaCoreBook();
        Book book2 = new DesignPatternBook();
        Book book3 = new BusinessBook();
        book1.accept(v);
        System.out.println();
        book2.accept(v);
        System.out.println();
        book3.accept(v);
        
    }
}
