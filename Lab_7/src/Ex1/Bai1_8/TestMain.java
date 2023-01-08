package Ex1.Bai1_8;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println("m1: " + m1);
        m1.moveDown();
        System.out.println("moveLeft of m1: " + m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println("m2: " + m2);
        m2.moveRight();
        System.out.println("moveRight of m2: " + m2);

        Movable m3 = new MovableRectangle(1, 3, 4, 6, 2, 5);
        System.out.println("m3: " + m3);
        m3.moveDown();
        System.out.println("moveDown m3: " + m3);
        m3.moveRight();
        System.out.println("moveRight m3: " + m3);


    }
}
