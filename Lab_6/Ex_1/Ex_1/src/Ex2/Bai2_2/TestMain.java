package Ex2.Bai2_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("\nCylinder1:" + "\nradius=" + cylinder1.getBase().getRadius() + "\nheight="
                + cylinder1.getHeight() + "\nbase area=" + cylinder1.getArea() + "\nvolume="
                + cylinder1.getVolume());


        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("\nCylinder2:" + "\nradius=" + cylinder2.getBase().getRadius() + "\nheight="
                + cylinder2.getHeight() + "\nbase area=" + cylinder2.getArea() + "\nvolume="
                + cylinder2.getVolume());


        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("\nCylinder3:" + "\nradius=" + cylinder3.getBase().getRadius() + "\nheight="
                + cylinder3.getHeight() + "\nbase area=" + cylinder3.getArea() + "\nvolume="
                + cylinder3.getVolume());
    }
}
