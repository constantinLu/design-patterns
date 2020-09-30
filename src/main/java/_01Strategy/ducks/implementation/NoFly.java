package _01Strategy.ducks.implementation;


import _01Strategy.ducks.interfaces.FlyBehavior;

public class NoFly implements FlyBehavior {

    public boolean fly() {
        System.out.println("ANIMAL: CANNOT FLY");
        return false;
    }
}
