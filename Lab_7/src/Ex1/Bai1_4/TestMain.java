package Ex1.Bai1_4;

public class TestMain {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(movableCircle);
        System.out.println();

        movableCircle.moveUp();
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        System.out.println(movableCircle);
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }
}
