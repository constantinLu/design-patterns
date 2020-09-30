package _03Decorator.starbuzz;

import _03Decorator.starbuzz.base.Beverage;
import _03Decorator.starbuzz.base.DarkRost;
import _03Decorator.starbuzz.base.Espresso;
import _03Decorator.starbuzz.decorators.Mocha;
import _03Decorator.starbuzz.decorators.Soy;
import _03Decorator.starbuzz.decorators.Whip;

public class StarbuzzSim {

    public static void main(String[] args) {

        Beverage beverage = new DarkRost();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());


        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());



        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());



    }
}
