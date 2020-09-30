package _03Decorator.starbuzz.base;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };

    Size size = Size.TALL;

    String description = "Unknown Beverage";


    public abstract double cost();


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }
}
