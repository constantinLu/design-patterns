package _01Strategy.ducks.implementation;


import _01Strategy.ducks.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {


    public boolean quack() {
        System.out.println("THIS DUCK CAN QUACK !!!!");
        return true;
    }

}
