package factory.abstractFactory;

import factory.abstractFactory.color.Color;
import factory.abstractFactory.shape.Shape;

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}
