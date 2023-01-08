package Ex2.Bai2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println();

        Point p3 = new Point(0, 1);
        Point p4 = new Point(2, 3);
        l2.setBegin(p3);
        l2.setEnd(p4);
        System.out.println(l2);
        System.out.println(l2.getBegin());
        System.out.println(l2.getEnd());

        l2.setBeginX(4);
        l2.setBeginY(5);
        l2.setEndX(6);
        l2.setEndY(7);
        System.out.println(l2);
        System.out.println(l2.getBeginX());
        System.out.println(l2.getBeginY());
        System.out.println(l2.getEndX());
        System.out.println(l2.getEndY());

        l2.setBeginXY(0, 0);
        l2.setEndXY(1, 1);
        System.out.println(l2);

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());


    }
}
