package _03Decorator.starbuzz.decorators;

import _03Decorator.starbuzz.base.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    public void printRecip() {
        System.out.println("" + getDescription() + cost());

    }
}
