package _07Adapter.simplifyduck.adapters;

import _07Adapter.simplifyduck.interfaces.Duck;
import _07Adapter.simplifyduck.interfaces.Turkey;

import java.util.Random;

/*
turning a duck into a turkey.
 */

public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck, Random random){
        this.duck = duck;
        this.random = random;
    }


    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
