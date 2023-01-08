package Ex1.Bai1_2;

import Ex1.Bai1_1.Circle;
import Ex1.Bai1_1.Rectangle;
import Ex1.Bai1_1.Shape;
import Ex1.Bai1_1.Square;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Ex1.Bai1_1.Circle("red", false, 5.5); // Upcast Circle to Shape
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius());
        System.out.println();

        Ex1.Bai1_1.Circle circle1 = (Circle) shape1; // Downcast back to Circle
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());
        System.out.println();

        // Shape shape2 = new Shape();

        Shape shape3 = new Ex1.Bai1_1.Rectangle("red", false, 1.0, 2.0); // Upcast
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // System.out.println(shape3.getLength());
        System.out.println();

        Ex1.Bai1_1.Rectangle rectangle1 = (Ex1.Bai1_1.Rectangle) shape3; // Downcast
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());
        System.out.println();

        Shape shape4 = new Square(6.6); // Upcast
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        // System.out.println(shape4.getSize());
        System.out.println();

        // Take note that we downcast Shape shape4 to Rectangle, which is a superclass
        // of Square, instead of Square
        Ex1.Bai1_1.Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        // System.out.println(rectangle2.getSide());
        System.out.println(rectangle2.getLength());
        System.out.println();

        // Downcast Rectangle rectangle2 to Square
        Square square1 = (Square) rectangle2;
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

    }
}
