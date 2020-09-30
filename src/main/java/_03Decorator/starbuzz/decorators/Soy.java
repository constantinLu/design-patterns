package _03Decorator.starbuzz.decorators;

import _03Decorator.starbuzz.base.Beverage;

public class Soy extends CondimentDecorator {


    private Beverage beverage;


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + getSizePrice();
    }

    public String getDescription() {
        return beverage.getDescription() + " with Soy.";
    }

    private double getSizePrice() {
        double price = 0;
        if (beverage.getSize().equals(Size.TALL)) {
            price = .10;

        } else if (beverage.getSize().equals(Size.GRANDE)) {
            price = .15;
        } else {
            price = .20;
        }
        return price;
    }
}
