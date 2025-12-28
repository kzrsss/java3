package inheritance;

public class Vehicle {
    protected String name;
    protected String color;
    protected int wheels;

    double speed = 40.0;

    private String enginCapasity;

    public void start(){
        System.out.println("Vehicle starting...");
    }

    public void stop(){
        System.out.println("Vehicle stoping...");
    }

    public static void drive(){
        System.out.println("Vehicle driving...");
    }
}
