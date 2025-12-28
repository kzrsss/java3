package inheritance;

public class VehicaleDemo {
    public static void main(String[] args) {
        //Inheritance
        Car car = new Car();
        car.carDetails();
        car.start();
        car.stop();
        car.drive();

        //can't be accessed outside package
        //System.out.println(car.speed);

        System.out.println(" ");
        Van van = new Van();
        van.vanDetails();
        car.start();
        car.stop();

        //Can access Multilevel Inheritance But can't access multiple inheritance
        System.out.println(" ");
        OldCar oldCar = new OldCar();
        oldCar.oldCarDetails();
        oldCar.start();
        oldCar.stop();

    }
}
