package AbstractFactory.AbstractFactory_Demo;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("ROUNDED RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory.getShape("ROUNDED SQUARE");
        shape4.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("ROUNDED");
        Shape shape5 = roundedShapeFactory.getShape("RECTANGLE");
        shape5.draw();
        Shape shape6 = roundedShapeFactory.getShape("SQUARE");
        shape6.draw();
    }
}
