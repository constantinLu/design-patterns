package _03Decorator.starbuzz.decorators;

import _03Decorator.starbuzz.base.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + .10;
    }

    public String getDescription() {
        return beverage.getDescription() + " with Whip.";
    }
}
