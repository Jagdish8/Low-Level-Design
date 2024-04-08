import factory.ShapeFactory;
import shape.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShapeObject("Circle");
        shape.draw();
    }
}
