package _01Strategy.challange.game.implementation;


import _01Strategy.challange.game.interfaces.WeponBehavior;

public class Axe implements WeponBehavior {

    public void useWepon() {
        System.out.println("AXE: 30 dmg");
    }
}
