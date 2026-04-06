package Decorater;

public class Demo {
    public static void main(String[] args) {
        // creates a basic laptop
        Laptop lp = new Laptop();
        System.out.println(lp.showDescription());

        // laptop with an SSD decorator
        LaptopSSD ls = new LaptopSSD(lp);
        System.out.println(ls.showDescription());

        // laptop with a DVD decorator
        LaptopDVD ld = new LaptopDVD(lp);
        System.out.println(ld.showDescription());

        // wraps that result with both DVD and SSD
        Laptop lsd = new LaptopDVD(new LaptopSSD(lp));
        System.out.println(lsd.showDescription());

        //你是谁
    }
}
