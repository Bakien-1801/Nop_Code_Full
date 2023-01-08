package Ex1.Bai1_3;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
//        this.x = x;
//        this.y = y;
        setXY(x, y);
    }

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
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

    public void setXY(float x, float y) {
//        this.x = x;
//        this.y = y;
        setX(x);
        setY(y);
    }

    public float[] getXY() {
//        float[] array = new float[2];
//        array[0] = x;
//        array[1] = y;
        // float array = {x, y};
//        return array;
        return new float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
