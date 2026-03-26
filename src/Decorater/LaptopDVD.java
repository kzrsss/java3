package Decorater;

public class LaptopDVD extends LaptopDecorator{

    Laptop laptop;

    public LaptopDVD(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String showDescription() {
        return laptop.showDescription() + " with DVD";
    }
}
