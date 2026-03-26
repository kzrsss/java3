package factory.abstractFactory;

import factory.abstractFactory.color.Color;
import factory.abstractFactory.shape.Shape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        AbstractFactory color = FactoryProducer.getFactory("COLOR");

        Shape shape1 = shape.getShape("RECTANGLE");
        shape1.shapeDraw();

        Shape shape2 = shape.getShape("CIRCLE");
        shape2.shapeDraw();

        Shape shape3 = shape.getShape("SQUARE");
        shape3.shapeDraw();

        Color cr1 = color.getColor("RED");
        cr1.colorDraw();
        Color cr2 = color.getColor("BLUE");
        cr2.colorDraw();
        Color cr3 = color.getColor("GREEN");
        cr3.colorDraw();
    }
}
