package Ex2.Bai2_1;

public class TestPoint {
    public static void main(String[] args) {
        Point point_1 = new Point(10, 20);
        System.out.println("point_1: " + point_1);
        point_1.getX();
        point_1.setX(18);
        System.out.println(point_1.getX());
        point_1.setY(1);
        System.out.println(point_1);
        System.out.println(point_1.getY());
        point_1.setXY(3, 4);
        System.out.println(point_1);

    }
}
