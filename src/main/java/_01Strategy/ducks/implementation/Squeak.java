package _01Strategy.ducks.implementation;


import _01Strategy.ducks.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

    public boolean quack() {
        System.out.println("THIS DUCK IS SQUEAKING....");
        return true;
    }
}
