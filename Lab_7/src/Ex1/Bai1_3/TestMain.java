package Ex1.Bai1_3;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 1, 1);
        System.out.println(movablePoint);
        System.out.println();

        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
