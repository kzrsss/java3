package factory.abstractFactory;

import factory.abstractFactory.color.Color;
import factory.abstractFactory.shape.Circle;
import factory.abstractFactory.shape.Rectangle;
import factory.abstractFactory.shape.Square;

import java.awt.*;

public class ShapeFactory extends AbstractFactory{
    public factory.abstractFactory.shape.Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();

        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();

        if (shapeType.equalsIgnoreCase("SQUARE")) return new Square();

        return null;
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }

}
