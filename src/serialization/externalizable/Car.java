package serialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends Vehical implements Externalizable {

    private static final long serialVersionUID = 1L;
    private int speed;
    private transient String name;

    public Car() {}

    public Car(int speed, String Color, String name) {
        super(Color);
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getColor());
        out.writeInt(speed);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColor((String) in.readObject());
        speed = in.readInt();
        name = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Car {" +
                "\n  color='" + getColor() + '\'' +
                ",\n  speed=" + getSpeed() +
                ",\n  name='" + getName() + "'\n" +
                '}';
    }
}
