package Ex2.Bai2_1;

public class TestLine {
    public static void main(String[] args) {
        Line line_1 = new Line(0, 0, 3, 4);
        System.out.println(line_1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line line_2 = new Line(p1, p2);
        System.out.println(line_2);
        System.out.println();

        Point p3 = new Point(0, 1);
        Point p4 = new Point(2, 3);
        line_2.setBegin(p3);
        line_2.setEnd(p4);
        System.out.println(line_2);
        System.out.println(line_2.getBegin());
        System.out.println(line_2.getEnd());

        line_2.setBeginX(4);
        line_2.setBeginY(5);
        line_2.setEndX(6);
        line_2.setEndY(7);
        System.out.println(line_2);
        System.out.println(line_2.getBeginX());
        System.out.println(line_2.getBeginY());
        System.out.println(line_2.getEndX());
        System.out.println(line_2.getEndY());

        line_2.setBeginXY(0, 0);
        line_2.setEndXY(1, 1);
        System.out.println(line_2);

        System.out.println(line_2.getLength());
        System.out.println(line_2.getGradient());


    }
}
