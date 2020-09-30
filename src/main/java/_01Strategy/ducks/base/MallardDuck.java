package _01Strategy.ducks.base;

public class MallardDuck extends Duck {

    public MallardDuck() {
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard Duck");
    }

    @Override
    public void swim() {
        System.out.println("MALLARD DUCK SWIMS UNDERWATER");
    }
}
