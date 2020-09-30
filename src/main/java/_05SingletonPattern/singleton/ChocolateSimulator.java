package _05SingletonPattern.singleton;

public class ChocolateSimulator {

    public static void main(String[] args) {

        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        chocolateBoiler2.fill();
        chocolateBoiler2.boil();
        chocolateBoiler2.drain();
    }
}
