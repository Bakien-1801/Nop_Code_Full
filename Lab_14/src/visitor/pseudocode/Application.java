package visitor.pseudocode;

import java.util.List;

public class Application {

    private static List<Shape> shapes;

    public static void main(String[] args) {
        List<Shape> list = List.of(new Dot(0, 0), new Circle(5, 5, 2), new Rectangle(3, 3, 1, 1));
        shapes = List.of(new Dot(1, 1), new Circle(1, 2, 3), new Rectangle(1, 1, 4, 4), new CompoundShape(list));

        Visitor exportVisitor = new XMLExportVisitor();

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).accept(exportVisitor));
        }
    }

}
