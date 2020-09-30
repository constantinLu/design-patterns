package _01Strategy.ducks;

import _01Strategy.ducks.base.Duck;
import _01Strategy.ducks.base.MallardDuck;
import _01Strategy.ducks.base.ModelDuck;
import _01Strategy.ducks.implementation.FlyRocketPowered;
import _01Strategy.ducks.implementation.FlyWithWings;
import _01Strategy.ducks.implementation.Quack;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.performFly();
        duck.performQuack();
        duck.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
