package _01Strategy.ducks.implementation;


import _01Strategy.ducks.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {


    public boolean fly() {
        System.out.println("ANIMAL: CAN FLY");
        return true;
    }
}
