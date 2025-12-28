package inheritance;

public class Van extends Vehicle{
    int noOfDoor;

    public void vanDetails(){
        name = "HIANCE";
        color = "White";
        wheels = 4;
        noOfDoor = 3;

        System.out.println("This is the Van details.");
        System.out.println("Van Type: " + name);
        System.out.println("Van Color: " + color);
        System.out.println("Van Wheels: " + wheels);
        System.out.println("Number of Doors: " + noOfDoor);
    }
}
