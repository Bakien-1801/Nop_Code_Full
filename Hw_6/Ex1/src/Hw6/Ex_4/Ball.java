package Hw6.Ex_4;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(direction);
        this.yDelta = speed * (float) Math.sin(direction);

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;

    }

    public void reflectHorizontal() {
        //this.xDelta = -this.xDelta;
        this.xDelta *= -1;

    }

    public void reflectVertical() {
        //this.yDelta = - this.yDelta;
        this.yDelta *= -1;

    }

    @Override
    public String toString() {
        return "Ball[" +
                "x=" + x +
                ", y=" + y +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                ']';
    }

}
