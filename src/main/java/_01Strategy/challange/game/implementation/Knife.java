package _01Strategy.challange.game.implementation;

import _01Strategy.challange.game.interfaces.WeponBehavior;

public class Knife implements WeponBehavior {

    public void useWepon() {
        System.out.println("KNIFE: 10 dmg");
    }
}
