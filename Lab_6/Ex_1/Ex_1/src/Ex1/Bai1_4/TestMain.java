package Ex1.Bai1_4;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("test shape:");
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("green", true);
        System.out.println(shape1);
        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1);
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println();

        // test circle
        System.out.println("test circle:");
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2.0);
        System.out.println(circle1);

        Circle circle2 = new Circle("yellow", true, 2.0);
        System.out.println(circle2);
        circle2.setRadius(3.0);
        System.out.println(circle2);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println();

        // test rectangle
        System.out.println("test rectangle:");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(1.0, 2.0);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("gray", false, 2.3, 2.3);
        System.out.println(rectangle2);
        rectangle2.setWidth(4.0);
        rectangle2.setLength(5.0);
        System.out.println(rectangle2);
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println();

        // test square
        System.out.println("test square:");
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(4.0);
        System.out.println(square1);

        Square square2 = new Square("pink", true, 3.4);
        System.out.println(square2);
        square2.setSide(6.0);
        System.out.println(square2);
        System.out.println(square2.getSide());
    }
}
