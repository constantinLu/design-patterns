package _01Strategy.ducks.implementation;

import _01Strategy.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    public boolean fly() {
        System.out.println("Rocket powerd Duck ! ");
        return true;
    }
}
