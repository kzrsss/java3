package interfaces;

// Interface
// 100% abstraction
public interface Vehicle {

    // Variables in interface are:
    // public static final by default
    int MAX_SPEED = 120;

    // Abstract methods (no body)
    void start();
    void stop();
}
