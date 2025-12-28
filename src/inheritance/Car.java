package inheritance;

public class Car extends Vehicle{
    //Can't inherit final class
    int noOfDoors;
    public void carDetails(){
        name = "TOYOTS";
        color = "Red";
        wheels = 4;
        noOfDoors = 4;
        int speed = (int) super.speed;

        System.out.println("This is the car details.");
        System.out.println("Car Type : " + name);
        System.out.println("Car Color : " + color);
        System.out.println("Car speed : " + speed);
        System.out.println("Car Wheels : " + wheels);
    }

/*//    @Override
//    public void start() {
//        super.start();
//        System.out.println(" This is the car starting.");
//    }*/
    //override every class that is inherit

    public static void drive(){
        System.out.println("Car driving...");
    }

//    public void start(){
//        super.start();
//        System.out.println("Car starting...");
//    }
}
