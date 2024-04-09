package factory;

import shape.Circle;
import shape.Shape;
import shape.Square;

public class ShapeFactory {

    Shape shape;

    public Shape getShapeObject(String name) {
        if(name.equals("Circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
