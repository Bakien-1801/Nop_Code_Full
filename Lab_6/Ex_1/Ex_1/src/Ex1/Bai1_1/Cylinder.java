package Ex1.Bai1_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
        // return super.getArea() * 2 + 2 *Math.PI * getArea() * height;
    }  

    @Override
    public String toString() {
        return "Cylinder: subclass of" + super.toString() +
                "height=" + height +
                '}';
    }
}
