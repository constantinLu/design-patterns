package _03Decorator.starbuzz.decorators;

import _03Decorator.starbuzz.base.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + .20;
    }

    public String getDescription() {
        return beverage.getDescription() + " with Mocha.";
    }
}
