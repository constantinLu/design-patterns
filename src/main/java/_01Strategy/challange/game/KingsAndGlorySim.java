package _01Strategy.challange.game;

import _01Strategy.challange.game.base.Character;
import _01Strategy.challange.game.base.King;
import _01Strategy.challange.game.implementation.Axe;

public class KingsAndGlorySim {

    public static void main(String[] args) {
        Character king = new King();
        king.setWeponBehavior(new Axe());
        king.fight();
        king.attack();
    }
}
