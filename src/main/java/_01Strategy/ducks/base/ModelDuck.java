package _01Strategy.ducks.base;

import _01Strategy.ducks.implementation.NoFly;
import _01Strategy.ducks.implementation.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {

        setFlyBehavior(new NoFly());
        setQuackBehavior(new Quack());
    }
    public void display() {
        System.out.println("I`m a model duck");
    }
}
