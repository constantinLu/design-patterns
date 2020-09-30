package _07Adapter.simplifyduck;

import _07Adapter.simplifyduck.adapters.TurkeyAdapter;
import _07Adapter.simplifyduck.impl.MallardDuck;
import _07Adapter.simplifyduck.impl.WildTurkey;
import _07Adapter.simplifyduck.interfaces.Duck;

public class DuckTestDrive {

    public static void main(String[] args) {

        // create objects
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        //wrap the turkey into turkeyAdaptor to make it look like a duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ... ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }


    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
