package _01Strategy.challange.game.implementation;


import _01Strategy.challange.game.interfaces.WeponBehavior;

public class BowAndArrow implements WeponBehavior {

  public void useWepon() {
    System.out.println("BOW AND ARROW: 20 dmg");
  }
}
