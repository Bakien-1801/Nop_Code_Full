package Ex1.Bai1_3;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("Test Point2D:");
        Point2D point2d = new Point2D();
        System.out.println(point2d);

        Point2D point2d_1 = new Point2D(2.0f, 1.0f);
        System.out.println(point2d_1);

        point2d_1.setX(3.0f);
        point2d_1.setY(2.0f);
        System.out.println(point2d_1);
        System.out.println(point2d_1.getX());
        System.out.println(point2d_1.getY());

        point2d_1.setXY(4.0f, 3.0f);
        System.out.println(point2d_1);
        float[] array2d = new float[2];
        array2d = point2d_1.getXY();
        for (int i = 0; i < array2d.length; i++) {
            System.out.print(array2d[i] + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("test point3d:");
        Point3D point3d = new Point3D();
        System.out.println(point3d);

        Point3D point3d_1 = new Point3D(3.0f, 2.0f, 1.0f);
        System.out.println(point3d_1);

        point3d_1.setZ(4.0f);
        System.out.println(point3d_1);
        System.out.println(point3d_1.getZ());

        point3d_1.setXYZ(4.0f, 7.0f, 2.0f);
        System.out.println(point3d_1);
        float[] array3d = new float[3];
        array3d = point3d_1.getXYZ();
        for (int i = 0; i < array3d.length; i++) {
            System.out.print(array3d[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
