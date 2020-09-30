package _01Strategy.ducks.base;

import _01Strategy.ducks.interfaces.FlyBehavior;
import _01Strategy.ducks.interfaces.QuackBehavior;
import _01Strategy.ducks.util.SizeEnum;

public  class Duck {

    private int id;

    private String color;

    private SizeEnum size;

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    private Duck duck;

    public void display() {
        System.out.println("MAIN DISPLAY");
    }

    public void swim() {
         System.out.println("DUCK is swiming ...");
     }

     public void performQuack() {
        quackBehavior.quack();
     }

    public  void performFly() {
        flyBehavior.fly();
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
