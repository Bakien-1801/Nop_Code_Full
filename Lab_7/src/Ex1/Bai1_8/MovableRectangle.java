package Ex1.Bai1_8;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ']';
    }

    @Override
    public void moveUp() {
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -= this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.bottomRight.y += this.bottomRight.ySpeed;
        this.topLeft.y += this.topLeft.ySpeed;

    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;

    }

    @Override
    public void moveRight() {
        this.bottomRight.x += this.bottomRight.xSpeed;
        this.topLeft.x += this.topLeft.xSpeed;

    }
}
