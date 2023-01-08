package Ex1.Bai1_5;

public class TestMain {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println(resizableCircle);

        resizableCircle.resize(60);
        System.out.println(resizableCircle);
    }
}
