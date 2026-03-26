package serialization.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    public void serialize(Car car){
        try{
            FileOutputStream fos = new FileOutputStream("car.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
            oos.close();
            fos.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void deserialize(){
        try{
            FileInputStream fis = new FileInputStream("car.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car car = (Car)ois.readObject();
            ois.close();
            fis.close();
            System.out.println(car);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
