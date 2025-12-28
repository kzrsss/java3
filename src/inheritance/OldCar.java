package inheritance;

public class OldCar extends Car{
    public void oldCarDetails(){
        name = "TOYOTS";
        color = "Red";
        wheels = 4;
        noOfDoors = 4;

        System.out.println("Old car Details");
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Wheels : " + wheels);
        System.out.println("No of Doors : " + noOfDoors);

    }
}
