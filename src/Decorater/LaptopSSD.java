package Decorater;

public class LaptopSSD extends LaptopDecorator{

    private Laptop laptop;

    public LaptopSSD(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String showDescription() {
        return laptop.showDescription() + "with SSD";
    }
}
