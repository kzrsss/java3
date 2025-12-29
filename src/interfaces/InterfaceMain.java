package interfaces;

public class InterfaceMain {
    public static void main(String[] args) {

        /*
         ================= INTERFACE RULES =================

         1. Interface is used to achieve 100% abstraction

         2. Interface cannot have constructor

         3. Interface cannot create objects
            ❌ Vehicle v = new Vehicle();

         4. Class uses "implements" keyword to use interface

         5. A class must implement ALL interface methods

         6. Interface supports multiple inheritance
            ✔ class A implements B, C

         7. Interface variables are:
            ✔ public
            ✔ static
            ✔ final

         8. Methods in interface are public by default

         ====================================================
        */

        // Interface reference, Bike object
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println(" ");

        // Interface reference, Car object
        Vehicle car = new Car();
        car.start();
        car.stop();

        // Accessing interface constant
        System.out.println("Max Speed : " + Vehicle.MAX_SPEED);

//        Bike starting...
//        Bike stopping...
//
//        Car starting...
//        Car stopping...
//        Max Speed : 120

    }
}
