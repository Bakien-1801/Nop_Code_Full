package Ex1.Bai1_5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[ " + super.toString() + ']';
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }
}
