package Ex2.Bai2_1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line: (" +
                "begin=" + begin +
                ", end=" + end +
                ')';
    }

    public Point getBegin() {
        return this.begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }

    public void setEndX(int endX) {
        this.end.setX(endX);
    }

    public void setEndY(int endY) {
        this.end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        this.end.setX(endX);
        this.end.setY(endY);
    }

    public double
    getLength() {
        int xDiff = this.begin.getX() - this.end.getX();
        int yDiff = this.begin.getY() - this.end.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = this.end.getX() - this.begin.getX();
        int yDiff = this.end.getY() - this.begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

}
