package interfaces;

// Bike implements Vehicle interface
public class Bike implements Vehicle {

    // Implementing interface method
    @Override
    public void start() {
        System.out.println("Bike starting...");
    }

    // Implementing interface method
    @Override
    public void stop() {
        System.out.println("Bike stopping...");
    }
}
