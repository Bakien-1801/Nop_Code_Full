package Ex1.Bai1_5;

import Ex1.Bai1_2.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[ " +
                "radius=" + radius +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
