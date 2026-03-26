package factory.abstractFactory;

import factory.abstractFactory.color.Blue;
import factory.abstractFactory.color.Color;
import factory.abstractFactory.color.Green;
import factory.abstractFactory.color.Red;
import factory.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String shapeColor) {
        if (shapeColor == null) return null;

        if (shapeColor.equalsIgnoreCase("RED")) return new Red();

        if (shapeColor.equalsIgnoreCase("GREEN")) return new Green();

        if (shapeColor.equalsIgnoreCase("BLUE")) return new Blue();

        return null;
    }
}
