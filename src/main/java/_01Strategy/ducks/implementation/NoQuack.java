package _01Strategy.ducks.implementation;


import _01Strategy.ducks.interfaces.QuackBehavior;

public class NoQuack implements QuackBehavior {

    public boolean quack() {
        System.out.println("TO SMALL TO QUACK");
        return false;
    }
}
