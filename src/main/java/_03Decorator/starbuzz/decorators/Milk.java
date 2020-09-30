package _03Decorator.starbuzz.decorators;

import _03Decorator.starbuzz.base.Beverage;

public class Milk extends CondimentDecorator {

    Beverage beverage;


    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + .10;
    }

    public String getDescription() {
        return beverage.getDescription()  + " with Milk.";
    }

    @Override
    public void printRecip() {
        super.printRecip();
    }
}
