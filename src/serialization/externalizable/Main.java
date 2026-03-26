package serialization.externalizable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(25, "Red", "BMW");

        MySerializer ms = new MySerializer();
        ms.serialize(car);
        ms.deserialize();
    }
}
